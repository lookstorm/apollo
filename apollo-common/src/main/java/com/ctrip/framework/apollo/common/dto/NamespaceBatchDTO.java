package com.ctrip.framework.apollo.common.dto;

import com.ctrip.framework.apollo.common.utils.InputValidator;

import javax.validation.constraints.Pattern;

public class NamespaceBatchDTO extends BaseDTO {
    private long id;

    private String appId;

    private String clusterName;

    private String NamespaceArea;

    private String itemArea;
    private String itemComment;
    private String opType;

    @Pattern(
            regexp = InputValidator.CLUSTER_NAMESPACE_VALIDATOR,
            message = "Namespace格式错误: " + InputValidator.INVALID_CLUSTER_NAMESPACE_MESSAGE
    )
    private String namespaceName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public String getClusterName() {
        return clusterName;
    }

    public String getNamespaceName() {
        return namespaceName;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public String getNamespaceArea() {
        return NamespaceArea;
    }

    public void setNamespaceArea(String namespaceArea) {
        NamespaceArea = namespaceArea;
    }

    public String getItemArea() {
        return itemArea;
    }

    public void setItemArea(String itemArea) {
        this.itemArea = itemArea;
    }

    public String getItemComment() {
        return itemComment;
    }

    public void setItemComment(String itemComment) {
        this.itemComment = itemComment;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }
}
