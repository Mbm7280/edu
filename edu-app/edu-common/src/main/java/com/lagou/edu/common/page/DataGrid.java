package com.lagou.edu.common.page;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: ma wei long
 * @date:   2020年6月30日 下午8:58:30
 */
////@Data
//@NoArgsConstructor
//@AllArgsConstructor
@ApiModel("分页数据结果集 VO")
public class DataGrid<T>{

    @ApiModelProperty("总记录数")
    private Long total = 0L;
    
    @ApiModelProperty("总页数数")
    private Long totalPages = 0L;
    
    @ApiModelProperty("总页数数")
    private Long currentPage = 0L;

    @ApiModelProperty("本页数据记录")
    private List<T> rows = new ArrayList<>();

    public DataGrid() {
    }

    public DataGrid(Long total, Long totalPages, Long currentPage, List<T> rows) {
        this.total = total;
        this.totalPages = totalPages;
        this.currentPage = currentPage;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public Long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
