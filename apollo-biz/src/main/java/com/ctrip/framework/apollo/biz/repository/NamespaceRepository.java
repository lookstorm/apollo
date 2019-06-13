package com.ctrip.framework.apollo.biz.repository;

import com.ctrip.framework.apollo.biz.entity.Namespace;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NamespaceRepository extends PagingAndSortingRepository<Namespace, Long> {

  List<Namespace> findByAppIdAndClusterNameOrderByIdAsc(String appId, String clusterName);

  @Query("SELECT n from Namespace n WHERE n.appId=:appId and n.clusterName=:clusterName and n.isDeleted=0")
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLike(@Param("appId") String appId, @Param("clusterName") String clusterName, Pageable pageable);

  @Query("SELECT n from Namespace n WHERE n.appId=:appId and n.clusterName=:clusterName and n.isDeleted=0 and n.namespaceName LIKE %:namespaceName%")
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithNamespace(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName") String namespaceName, Pageable pageable);

  @Query(value = "SELECT * from namespace n,item i WHERE n.Id=i.NamespaceId and n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and i.IsDeleted=0 and i.Key like %:keyName% group by n.NamespaceName", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithKey(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("keyName") String keyName, Pageable pageable);

  @Query(value = "SELECT * from namespace n,item i WHERE n.Id=i.NamespaceId and n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and i.IsDeleted=0 and n.NamespaceName LIKE %:namespaceName% and i.Key like %:keyName% group by n.NamespaceName", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithAll(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName") String namespaceName, @Param("keyName") String keyName, Pageable pageable);

  Namespace findByAppIdAndClusterNameAndNamespaceName(String appId, String clusterName, String namespaceName);

  @Modifying
  @Query("update Namespace set isdeleted=1,DataChange_LastModifiedBy = ?3 where appId=?1 and clusterName=?2")
  int batchDelete(String appId, String clusterName, String operator);

  List<Namespace> findByAppIdAndNamespaceNameOrderByIdAsc(String appId, String namespaceName);

  List<Namespace> findByNamespaceName(String namespaceName, Pageable page);

  int countByNamespaceNameAndAppIdNot(String namespaceName, String appId);

}
