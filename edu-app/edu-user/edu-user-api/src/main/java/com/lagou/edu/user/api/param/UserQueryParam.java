package com.lagou.edu.user.api.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class UserQueryParam implements Serializable {
    private Integer currentPage;
    private Integer pageSize;
    private String phone;
    private Integer userId;
    private Date startCreateTime;
    private Date endCreateTime;

    public UserQueryParam() {
    }

    public UserQueryParam(Integer currentPage, Integer pageSize, String phone, Integer userId, Date startCreateTime, Date endCreateTime) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.phone = phone;
        this.userId = userId;
        this.startCreateTime = startCreateTime;
        this.endCreateTime = endCreateTime;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(Date startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public Date getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(Date endCreateTime) {
        this.endCreateTime = endCreateTime;
    }
}
