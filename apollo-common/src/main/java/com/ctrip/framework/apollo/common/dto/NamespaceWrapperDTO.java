package com.ctrip.framework.apollo.common.dto;

import java.util.List;

/**
 * Package: com.ctrip.framework.apollo.common.dto
 * User: 于淼
 * Email: yumiao3@jd.com
 * Date: 2019/6/13
 * Time: 下午2:13
 * Description:
 */
public class NamespaceWrapperDTO {
    //当前页内容
    private List<NamespaceDTO> namespaceList;

    //当前页大小
    private int pageSize;

    //页码
    private int pageNumber;

    //分页总数
    private int totalPages;

    //当前页元素数
    private int numberOfElements;

    //总元素数
    private long totalElements;

    //是否有上一页
    private boolean hasPreviousPage;

    //是否第一页
    private boolean isFirstPage;

    //是否有下一页
    private boolean hasNextPage;

    //是否最后一页
    private boolean isLastPage;


    public List<NamespaceDTO>  getNamespaceList() {
        return namespaceList;
    }

    public void setNamespaceList(List<NamespaceDTO>  namespaceList) {
        this.namespaceList = namespaceList;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public boolean isHasPreviousPage() {
        return hasPreviousPage;
    }

    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public boolean isFirstPage() {
        return isFirstPage;
    }

    public void setFirstPage(boolean firstPage) {
        isFirstPage = firstPage;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public boolean isLastPage() {
        return isLastPage;
    }

    public void setLastPage(boolean lastPage) {
        isLastPage = lastPage;
    }
}
