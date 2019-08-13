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

  @Query(value = "SELECT * from namespace n left join namespacelock l on n.Id=l.NamespaceId where n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLike(@Param("appId") String appId, @Param("clusterName") String clusterName, Pageable pageable);

  @Query(value="SELECT * from namespace n left join namespacelock l on n.Id=l.NamespaceId where n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and n.NamespaceName LIKE %:namespaceName% order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithNamespace(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName") String namespaceName, Pageable pageable);

  @Query(value = "SELECT * from namespace n inner join item i on n.Id=i.NamespaceId left join namespacelock l on n.Id=l.NamespaceId where n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and i.IsDeleted=0 and i.Key like %:keyName% group by n.NamespaceName order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithKey(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("keyName") String keyName, Pageable pageable);

  @Query(value = "SELECT * from namespace n inner join item i on n.Id=i.NamespaceId left join namespacelock l on n.Id=l.NamespaceId WHERE n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and i.IsDeleted=0 and n.NamespaceName LIKE %:namespaceName% and i.Key like %:keyName% group by n.NamespaceName order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithAll(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName") String namespaceName, @Param("keyName") String keyName, Pageable pageable);


  @Query(value="SELECT * from namespace n left join namespacelock l on n.Id=l.NamespaceId WHERE n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and n.NamespaceName LIKE %:namespaceName1% and n.NamespaceName LIKE %:namespaceName2% order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithNamespace42(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName1") String namespaceName1, @Param("namespaceName2") String namespaceName2, Pageable pageable);

  @Query(value = "SELECT * from namespace n inner join item i on n.Id=i.NamespaceId left join namespacelock l on n.Id=l.NamespaceId WHERE n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and i.IsDeleted=0 and n.NamespaceName LIKE %:namespaceName1% and n.NamespaceName LIKE %:namespaceName2% and i.Key like %:keyName% group by n.NamespaceName order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithAll42(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName1") String namespaceName1, @Param("namespaceName2") String namespaceName2, @Param("keyName") String keyName, Pageable pageable);

  @Query(value="SELECT * from namespace n left join namespacelock l on n.Id=l.NamespaceId WHERE n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and n.NamespaceName LIKE %:namespaceName1% and n.NamespaceName LIKE %:namespaceName2% and n.NamespaceName LIKE %:namespaceName3% order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithNamespace43(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName1") String namespaceName1, @Param("namespaceName2") String namespaceName2, @Param("namespaceName3") String namespaceName3, Pageable pageable);

  @Query(value = "SELECT * from namespace n inner join item i on n.Id=i.NamespaceId left join namespacelock l on n.Id=l.NamespaceId where n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and i.IsDeleted=0 and n.NamespaceName LIKE %:namespaceName1% and n.NamespaceName LIKE %:namespaceName2% and n.NamespaceName LIKE %:namespaceName3% and i.Key like %:keyName% group by n.NamespaceName order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithAll43(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName1") String namespaceName1, @Param("namespaceName2") String namespaceName2, @Param("namespaceName3") String namespaceName3, @Param("keyName") String keyName, Pageable pageable);

  @Query(value="SELECT * from namespace n left join namespacelock l on n.Id=l.NamespaceId WHERE n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and n.NamespaceName LIKE %:namespaceName1% and n.NamespaceName LIKE %:namespaceName2% and n.NamespaceName LIKE %:namespaceName3% and n.NamespaceName LIKE %:namespaceName4% order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithNamespace44(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName1") String namespaceName1, @Param("namespaceName2") String namespaceName2, @Param("namespaceName3") String namespaceName3, @Param("namespaceName4") String namespaceName4, Pageable pageable);

  @Query(value = "SELECT * from namespace n inner join item i on n.Id=i.NamespaceId left join namespacelock l on n.Id=l.NamespaceId WHERE n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and i.IsDeleted=0 and n.NamespaceName LIKE %:namespaceName1% and n.NamespaceName LIKE %:namespaceName2% and n.NamespaceName LIKE %:namespaceName3% and n.NamespaceName LIKE %:namespaceName4% and i.Key like %:keyName% group by n.NamespaceName order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithAll44(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName1") String namespaceName1, @Param("namespaceName2") String namespaceName2, @Param("namespaceName3") String namespaceName3, @Param("namespaceName4") String namespaceName4, @Param("keyName") String keyName, Pageable pageable);

  @Query(value="SELECT n from namespace n left join namespacelock l on n.Id=l.NamespaceId WHERE n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and n.NamespaceName LIKE %:namespaceName1% and n.NamespaceName LIKE %:namespaceName2% and n.NamespaceName LIKE %:namespaceName3% and n.NamespaceName LIKE %:namespaceName4% and n.NamespaceName LIKE %:namespaceName5% order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithNamespace45(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName1") String namespaceName1, @Param("namespaceName2") String namespaceName2, @Param("namespaceName3") String namespaceName3, @Param("namespaceName4") String namespaceName4, @Param("namespaceName5") String namespaceName5, Pageable pageable);

  @Query(value = "SELECT * from namespace n inner join item i on n.Id=i.NamespaceId left join namespacelock l on n.Id=l.NamespaceId WHERE n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and i.IsDeleted=0 and n.NamespaceName LIKE %:namespaceName1% and n.NamespaceName LIKE %:namespaceName2% and n.NamespaceName LIKE %:namespaceName3% and n.NamespaceName LIKE %:namespaceName4% and n.NamespaceName LIKE %:namespaceName5% and i.Key like %:keyName% group by n.NamespaceName order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithAll45(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName1") String namespaceName1, @Param("namespaceName2") String namespaceName2, @Param("namespaceName3") String namespaceName3, @Param("namespaceName4") String namespaceName4, @Param("namespaceName5") String namespaceName5, @Param("keyName") String keyName, Pageable pageable);

  @Query(value = "SELECT n from namespace n left join namespacelock l on n.Id=l.NamespaceId WHERE n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and n.NamespaceName LIKE %:namespaceName1% and n.NamespaceName LIKE %:namespaceName2% and n.NamespaceName LIKE %:namespaceName3% and n.NamespaceName LIKE %:namespaceName4% and n.NamespaceName LIKE %:namespaceName5% and n.NamespaceName LIKE %:namespaceName6% order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithNamespace46(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName1") String namespaceName1, @Param("namespaceName2") String namespaceName2, @Param("namespaceName3") String namespaceName3, @Param("namespaceName4") String namespaceName4, @Param("namespaceName5") String namespaceName5, @Param("namespaceName6") String namespaceName6, Pageable pageable);

  @Query(value = "SELECT * from namespace n inner join item i on n.Id=i.NamespaceId left join namespacelock l on n.Id=l.NamespaceId WHERE n.AppId=:appId and n.ClusterName=:clusterName and n.IsDeleted=0 and i.IsDeleted=0 and n.NamespaceName LIKE %:namespaceName1% and n.NamespaceName LIKE %:namespaceName2% and n.NamespaceName LIKE %:namespaceName3% and n.NamespaceName LIKE %:namespaceName4% and n.NamespaceName LIKE %:namespaceName5% and n.NamespaceName LIKE %:namespaceName6% and i.Key like %:keyName% group by n.NamespaceName order by l.NamespaceId desc", nativeQuery = true)
  Page<Namespace> findByAppIdAndClusterNameOrderByIdAscLikeWithAll46(@Param("appId") String appId, @Param("clusterName") String clusterName, @Param("namespaceName1") String namespaceName1, @Param("namespaceName2") String namespaceName2, @Param("namespaceName3") String namespaceName3, @Param("namespaceName4") String namespaceName4, @Param("namespaceName5") String namespaceName5, @Param("namespaceName6") String namespaceName6, @Param("keyName") String keyName, Pageable pageable);

  Namespace findByAppIdAndClusterNameAndNamespaceName(String appId, String clusterName, String namespaceName);

  @Modifying
  @Query("update Namespace set isdeleted=1,DataChange_LastModifiedBy = ?3 where appId=?1 and clusterName=?2")
  int batchDelete(String appId, String clusterName, String operator);

  List<Namespace> findByAppIdAndNamespaceNameOrderByIdAsc(String appId, String namespaceName);

  List<Namespace> findByNamespaceName(String namespaceName, Pageable page);

  int countByNamespaceNameAndAppIdNot(String namespaceName, String appId);

}
