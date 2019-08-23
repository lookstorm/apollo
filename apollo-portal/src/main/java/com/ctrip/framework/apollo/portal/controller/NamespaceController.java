package com.ctrip.framework.apollo.portal.controller;

import com.alibaba.fastjson.JSONObject;
import com.ctrip.framework.apollo.common.dto.AppNamespaceDTO;
import com.ctrip.framework.apollo.common.dto.ItemDTO;
import com.ctrip.framework.apollo.common.dto.NamespaceBatchDTO;
import com.ctrip.framework.apollo.common.dto.NamespaceDTO;
import com.ctrip.framework.apollo.common.entity.AppNamespace;
import com.ctrip.framework.apollo.common.exception.BadRequestException;
import com.ctrip.framework.apollo.common.http.MultiResponseEntity;
import com.ctrip.framework.apollo.common.http.RichResponseEntity;
import com.ctrip.framework.apollo.common.utils.BeanUtils;
import com.ctrip.framework.apollo.common.utils.RequestPrecondition;
import com.ctrip.framework.apollo.core.enums.Env;
import com.ctrip.framework.apollo.openapi.dto.OpenItemDTO;
import com.ctrip.framework.apollo.openapi.util.OpenApiBeanUtils;
import com.ctrip.framework.apollo.portal.api.AdminServiceAPI;
import com.ctrip.framework.apollo.portal.component.PermissionValidator;
import com.ctrip.framework.apollo.portal.component.config.PortalConfig;
import com.ctrip.framework.apollo.portal.entity.bo.NamespaceBO;
import com.ctrip.framework.apollo.portal.entity.bo.NamespaceWrapperBO;
import com.ctrip.framework.apollo.portal.entity.model.NamespaceBatchModel;
import com.ctrip.framework.apollo.portal.entity.model.NamespaceCreationModel;
import com.ctrip.framework.apollo.portal.enums.OpType;
import com.ctrip.framework.apollo.portal.listener.AppNamespaceCreationEvent;
import com.ctrip.framework.apollo.portal.listener.AppNamespaceDeletionEvent;
import com.ctrip.framework.apollo.portal.service.AppNamespaceService;
import com.ctrip.framework.apollo.portal.service.ItemService;
import com.ctrip.framework.apollo.portal.service.NamespaceService;
import com.ctrip.framework.apollo.portal.service.RoleInitializationService;
import com.ctrip.framework.apollo.portal.spi.UserInfoHolder;
import com.ctrip.framework.apollo.tracer.Tracer;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static com.ctrip.framework.apollo.common.utils.RequestPrecondition.checkModel;

@RestController
public class NamespaceController {

    private static final Logger logger = LoggerFactory.getLogger(NamespaceController.class);

    private final ApplicationEventPublisher publisher;
    private final UserInfoHolder userInfoHolder;
    private final NamespaceService namespaceService;
    private final AppNamespaceService appNamespaceService;
    private final RoleInitializationService roleInitializationService;
    private final PortalConfig portalConfig;
    private final PermissionValidator permissionValidator;
    private final AdminServiceAPI.NamespaceAPI namespaceAPI;
    private final ItemService itemService;

    public NamespaceController(
            final ApplicationEventPublisher publisher,
            final UserInfoHolder userInfoHolder,
            final NamespaceService namespaceService,
            final AppNamespaceService appNamespaceService,
            final RoleInitializationService roleInitializationService,
            final PortalConfig portalConfig,
            final PermissionValidator permissionValidator,
            final AdminServiceAPI.NamespaceAPI namespaceAPI,
            ItemService itemService) {
        this.publisher = publisher;
        this.userInfoHolder = userInfoHolder;
        this.namespaceService = namespaceService;
        this.appNamespaceService = appNamespaceService;
        this.roleInitializationService = roleInitializationService;
        this.portalConfig = portalConfig;
        this.permissionValidator = permissionValidator;
        this.namespaceAPI = namespaceAPI;
        this.itemService = itemService;
    }


    @GetMapping("/appnamespaces/public")
    public List<AppNamespace> findPublicAppNamespaces() {
        return appNamespaceService.findPublicAppNamespaces();
    }

    @GetMapping("/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces")
    public List<NamespaceBO> findNamespaces(@PathVariable String appId, @PathVariable String env,
                                            @PathVariable String clusterName) {

        List<NamespaceBO> namespaceBOs = namespaceService.findNamespaceBOs(appId, Env.valueOf(env), clusterName);

        for (NamespaceBO namespaceBO : namespaceBOs) {
            if (permissionValidator.shouldHideConfigToCurrentUser(appId, env, namespaceBO.getBaseInfo().getNamespaceName())) {
                namespaceBO.hideItems();
            }
        }

        return namespaceBOs;
    }

    @GetMapping("/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaceslike")
    public List<NamespaceBO> findNamespacesLike(@PathVariable String appId, @PathVariable String env,
                                                @PathVariable String clusterName,
                                                @RequestParam(name = "namespaceName", defaultValue = "") String namespaceName,
                                                @RequestParam(name = "keyName", defaultValue = "") String keyName,
                                                @RequestParam(name = "page", defaultValue = "0") int page,
                                                @RequestParam(name = "size", defaultValue = "10") int size) {
        logger.info("==0===findNamespacesLike: {}, {}, {}, {}", namespaceName, keyName, page, size);

        List<NamespaceBO> namespaceBOs = namespaceService.findNamespaceBOsLike(appId, Env.valueOf(env), clusterName, namespaceName, keyName, page, size);

        for (NamespaceBO namespaceBO : namespaceBOs) {
            if (permissionValidator.shouldHideConfigToCurrentUser(appId, env, namespaceBO.getBaseInfo().getNamespaceName())) {
                namespaceBO.hideItems();
            }
        }

        return namespaceBOs;
    }

    @GetMapping("/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaceslikeV1")
    public NamespaceWrapperBO findNamespacesLikeV1(@PathVariable String appId, @PathVariable String env,
                                                   @PathVariable String clusterName,
                                                   @RequestParam(name = "namespaceName", defaultValue = "") String namespaceName,
                                                   @RequestParam(name = "keyName", defaultValue = "") String keyName,
                                                   @RequestParam(name = "page", defaultValue = "0") int page,
                                                   @RequestParam(name = "size", defaultValue = "10") int size) {
        logger.info("==0.1==findNamespacesLike: {}, {}, {}, {}", namespaceName, keyName, page, size);

        NamespaceWrapperBO namespaceWrapperBO = namespaceService.findNamespaceBOsLikeV1(appId, Env.valueOf(env), clusterName, namespaceName, keyName, page, size);
        List<NamespaceBO> namespaceBOs = namespaceWrapperBO.getNamespaceBOList();

        for (NamespaceBO namespaceBO : namespaceBOs) {
            if (permissionValidator.shouldHideConfigToCurrentUser(appId, env, namespaceBO.getBaseInfo().getNamespaceName())) {
                namespaceBO.hideItems();
            }
        }

        return namespaceWrapperBO;
    }

    @GetMapping("/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName:.+}")
    public NamespaceBO findNamespace(@PathVariable String appId, @PathVariable String env,
                                     @PathVariable String clusterName, @PathVariable String namespaceName) {

        NamespaceBO namespaceBO = namespaceService.loadNamespaceBO(appId, Env.valueOf(env), clusterName, namespaceName);

        if (namespaceBO != null && permissionValidator.shouldHideConfigToCurrentUser(appId, env, namespaceName)) {
            namespaceBO.hideItems();
        }

        return namespaceBO;
    }

    @GetMapping("/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/associated-public-namespace")
    public NamespaceBO findPublicNamespaceForAssociatedNamespace(@PathVariable String env,
                                                                 @PathVariable String appId,
                                                                 @PathVariable String namespaceName,
                                                                 @PathVariable String clusterName) {

        return namespaceService.findPublicNamespaceForAssociatedNamespace(Env.valueOf(env), appId, clusterName, namespaceName);
    }

    @PreAuthorize(value = "@permissionValidator.hasCreateNamespacePermission(#appId)")
    @PostMapping("/apps/{appId}/namespaces")
    public ResponseEntity<Void> createNamespace(@PathVariable String appId,
                                                @RequestBody List<NamespaceCreationModel> models) {

        checkModel(!CollectionUtils.isEmpty(models));

        String namespaceName = models.get(0).getNamespace().getNamespaceName();
        String operator = userInfoHolder.getUser().getUserId();

        roleInitializationService.initNamespaceRoles(appId, namespaceName, operator);
        roleInitializationService.initNamespaceEnvRoles(appId, namespaceName, operator);

        for (NamespaceCreationModel model : models) {
            NamespaceDTO namespace = model.getNamespace();
            RequestPrecondition.checkArgumentsNotEmpty(model.getEnv(), namespace.getAppId(),
                    namespace.getClusterName(), namespace.getNamespaceName());

            try {
                namespaceService.createNamespace(Env.valueOf(model.getEnv()), namespace);
            } catch (Exception e) {
                logger.error("create namespace fail.", e);
                Tracer.logError(
                        String.format("create namespace fail. (env=%s namespace=%s)", model.getEnv(),
                                namespace.getNamespaceName()), e);
            }
        }

        namespaceService.assignNamespaceRoleToOperator(appId, namespaceName, userInfoHolder.getUser().getUserId());

        return ResponseEntity.ok().build();
    }

    @PreAuthorize(value = "@permissionValidator.hasCreateNamespacePermission(#appId)")
    @PostMapping("/apps/{appId}/batchWriteAndUpdateNamespaces")
    public ResponseEntity<Void> batchWriteAndUpdateNamespaces(@PathVariable String appId,
                                                              @RequestBody List<NamespaceBatchModel> models) {
        logger.info("batchWriteAndUpdateNamespaces request: {}", JSONObject.toJSONString(models));

        if (org.apache.commons.collections4.CollectionUtils.isEmpty(models)) {
            throw new BadRequestException("请输入Namespace及键值数据");
        }

        Multimap<String, String> errorResult = ArrayListMultimap.create();

        for (NamespaceBatchModel model : models) {
            NamespaceBatchDTO namespaceBatchDTO = null;
            String namespaceArea = null;
            String itemArea = null;

            namespaceBatchDTO = model.getNamespace();

            namespaceArea = namespaceBatchDTO.getNamespaceArea();
            itemArea = namespaceBatchDTO.getItemArea();
            String opType = namespaceBatchDTO.getOpType();

            String[] namespaceArray = namespaceArea.split("\n");
            String[] itemArray = itemArea.split("\n");
            for (String namespaceObj : namespaceArray) {
                for (String itemObj : itemArray) {
                    String[] itemKV = itemObj.split("=");

                    if (OpType.DEL.getName().equals(opType)) {
                        try{
                            ItemDTO toDeleteItem = itemService.loadItem(Env.fromString(model.getEnv()), appId, namespaceBatchDTO.getClusterName(), namespaceObj, itemKV[0]);
                            if (toDeleteItem == null) {
                                //throw new BadRequestException("item not exists");
                                continue;
                            }

                            itemService.deleteItem(Env.fromString(model.getEnv()), toDeleteItem.getId(), userInfoHolder.getUser().getUserId());
                        }catch (Exception e){
                            logger.error("batchWriteAndUpdateNamespaces del error", e);
                        }

                    } else if (OpType.AAM.getName().equals(opType)) {
                        OpenItemDTO item = new OpenItemDTO();

                        try {
                            item.setKey(itemKV[0]);
                            item.setValue(itemKV[1]);
                            item.setComment(namespaceBatchDTO.getItemComment());
                            item.setDataChangeLastModifiedBy(userInfoHolder.getUser().getUserId());

                            ItemDTO toUpdateItem = itemService
                                    .loadItem(Env.fromString(model.getEnv()), appId, namespaceBatchDTO.getClusterName(), namespaceObj, item.getKey());
                            //protect. only value,comment,lastModifiedBy can be modified
                            toUpdateItem.setComment(item.getComment());
                            toUpdateItem.setValue(item.getValue());
                            toUpdateItem.setDataChangeLastModifiedBy(item.getDataChangeLastModifiedBy());

                            itemService.updateItem(appId, Env.fromString(model.getEnv()), namespaceBatchDTO.getClusterName(), namespaceObj, toUpdateItem);
                        } catch (Throwable ex) {
                            if (ex instanceof HttpStatusCodeException) {
                                try {
                                    // not check createIfNotExists
                                    if (((HttpStatusCodeException) ex).getStatusCode().equals(HttpStatus.NOT_FOUND)) {
                                        ItemDTO toCreate = OpenApiBeanUtils.transformToItemDTO(item);

                                        //protect
                                        toCreate.setLineNum(0);
                                        toCreate.setId(0);
                                        toCreate.setDataChangeLastModifiedBy(userInfoHolder.getUser().getUserId());
                                        toCreate.setDataChangeCreatedBy(userInfoHolder.getUser().getUserId());
                                        toCreate.setDataChangeLastModifiedTime(null);
                                        toCreate.setDataChangeCreatedTime(null);

                                        itemService.createItem(appId, Env.fromString(model.getEnv()),
                                                namespaceBatchDTO.getClusterName(), namespaceObj, toCreate);
                                    }
                                } catch (Exception e) {
                                    errorResult.put(namespaceObj, String.format("%s: %s", item.getKey(), item.getValue()));
                                }

                            } else {
                                errorResult.put(namespaceObj, String.format("%s: %s", item.getKey(), item.getValue()));
                            }
                        }
                    }else{
                        throw new BadRequestException("请选择正确的操作类型");
                    }

                }

            }
        }

        if (errorResult.size() > 0) {
            throw new BadRequestException("以下数据入库失败，请检查:\r\n" + JSONObject.toJSONString(errorResult));
        }

        return ResponseEntity.ok().build();
    }

    @PreAuthorize(value = "@permissionValidator.hasDeleteNamespacePermission(#appId)")
    @DeleteMapping("/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/{namespaceName:.+}")
    public ResponseEntity<Void> deleteNamespace(@PathVariable String appId, @PathVariable String env,
                                                @PathVariable String clusterName, @PathVariable String namespaceName) {

        namespaceService.deleteNamespace(appId, Env.valueOf(env), clusterName, namespaceName);

        return ResponseEntity.ok().build();
    }

    @PreAuthorize(value = "@permissionValidator.isSuperAdmin()")
    @DeleteMapping("/apps/{appId}/appnamespaces/{namespaceName:.+}")
    public ResponseEntity<Void> deleteAppNamespace(@PathVariable String appId, @PathVariable String namespaceName) {

        AppNamespace appNamespace = appNamespaceService.deleteAppNamespace(appId, namespaceName);

        publisher.publishEvent(new AppNamespaceDeletionEvent(appNamespace));

        return ResponseEntity.ok().build();
    }

    @GetMapping("/apps/{appId}/appnamespaces/{namespaceName:.+}")
    public AppNamespaceDTO findAppNamespace(@PathVariable String appId, @PathVariable String namespaceName) {
        AppNamespace appNamespace = appNamespaceService.findByAppIdAndName(appId, namespaceName);

        if (appNamespace == null) {
            throw new BadRequestException(
                    String.format("AppNamespace not exists. AppId = %s, NamespaceName = %s", appId, namespaceName));
        }

        return BeanUtils.transform(AppNamespaceDTO.class, appNamespace);
    }

    @PreAuthorize(value = "@permissionValidator.hasCreateAppNamespacePermission(#appId, #appNamespace)")
    @PostMapping("/apps/{appId}/appnamespaces")
    public AppNamespace createAppNamespace(@PathVariable String appId,
                                           @RequestParam(defaultValue = "true") boolean appendNamespacePrefix,
                                           @Valid @RequestBody AppNamespace appNamespace) {
        AppNamespace createdAppNamespace = appNamespaceService.createAppNamespaceInLocal(appNamespace, appendNamespacePrefix);

        if (portalConfig.canAppAdminCreatePrivateNamespace() || createdAppNamespace.isPublic()) {
            namespaceService.assignNamespaceRoleToOperator(appId, appNamespace.getName(),
                    userInfoHolder.getUser().getUserId());
        }

        publisher.publishEvent(new AppNamespaceCreationEvent(createdAppNamespace));

        return createdAppNamespace;
    }

    /**
     * env -> cluster -> cluster has not published namespace?
     * Example:
     * dev ->
     * default -> true   (default cluster has not published namespace)
     * customCluster -> false (customCluster cluster's all namespaces had published)
     */
    @GetMapping("/apps/{appId}/namespaces/publish_info")
    public Map<String, Map<String, Boolean>> getNamespacesPublishInfo(@PathVariable String appId) {
        return namespaceService.getNamespacesPublishInfo(appId);
    }

    @GetMapping("/envs/{env}/appnamespaces/{publicNamespaceName}/namespaces")
    public List<NamespaceDTO> getPublicAppNamespaceAllNamespaces(@PathVariable String env,
                                                                 @PathVariable String publicNamespaceName,
                                                                 @RequestParam(name = "page", defaultValue = "0") int page,
                                                                 @RequestParam(name = "size", defaultValue = "10") int size) {

        return namespaceService.getPublicAppNamespaceAllNamespaces(Env.fromString(env), publicNamespaceName, page, size);

    }

    @GetMapping("/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces")
    public MultiResponseEntity<String> findMissingNamespaces(@PathVariable String appId, @PathVariable String env, @PathVariable String clusterName) {

        MultiResponseEntity<String> response = MultiResponseEntity.ok();

        Set<String> missingNamespaces = findMissingNamespaceNames(appId, env, clusterName);

        for (String missingNamespace : missingNamespaces) {
            response.addResponseEntity(RichResponseEntity.ok(missingNamespace));
        }

        return response;
    }

    @PostMapping("/apps/{appId}/envs/{env}/clusters/{clusterName}/missing-namespaces")
    public ResponseEntity<Void> createMissingNamespaces(@PathVariable String appId, @PathVariable String env, @PathVariable String clusterName) {

        Set<String> missingNamespaces = findMissingNamespaceNames(appId, env, clusterName);

        for (String missingNamespace : missingNamespaces) {
            namespaceAPI.createMissingAppNamespace(Env.fromString(env), findAppNamespace(appId, missingNamespace));
        }

        return ResponseEntity.ok().build();
    }

    private Set<String> findMissingNamespaceNames(String appId, String env, String clusterName) {
        List<AppNamespaceDTO> configDbAppNamespaces = namespaceAPI.getAppNamespaces(appId, Env.fromString(env));
        List<NamespaceDTO> configDbNamespaces = namespaceService.findNamespaces(appId, Env.fromString(env), clusterName);
        List<AppNamespace> portalDbAppNamespaces = appNamespaceService.findByAppId(appId);

        Set<String> configDbAppNamespaceNames = configDbAppNamespaces.stream().map(AppNamespaceDTO::getName)
                .collect(Collectors.toSet());
        Set<String> configDbNamespaceNames = configDbNamespaces.stream().map(NamespaceDTO::getNamespaceName)
                .collect(Collectors.toSet());

        Set<String> portalDbAllAppNamespaceNames = Sets.newHashSet();
        Set<String> portalDbPrivateAppNamespaceNames = Sets.newHashSet();

        for (AppNamespace appNamespace : portalDbAppNamespaces) {
            portalDbAllAppNamespaceNames.add(appNamespace.getName());
            if (!appNamespace.isPublic()) {
                portalDbPrivateAppNamespaceNames.add(appNamespace.getName());
            }
        }

        // AppNamespaces should be the same
        Set<String> missingAppNamespaceNames = Sets.difference(portalDbAllAppNamespaceNames, configDbAppNamespaceNames);
        // Private namespaces should all exist
        Set<String> missingNamespaceNames = Sets.difference(portalDbPrivateAppNamespaceNames, configDbNamespaceNames);

        return Sets.union(missingAppNamespaceNames, missingNamespaceNames);
    }
}
