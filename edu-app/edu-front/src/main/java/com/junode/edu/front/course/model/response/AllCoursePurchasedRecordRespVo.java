package com.junode.edu.front.course.model.response;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

////@Data
public class AllCoursePurchasedRecordRespVo {
    @ApiModelProperty(value = "模块标题")
    private String title;

    @ApiModelProperty(value = "专栏或视频课购买记录")
    private List<CoursePurchasedRecordRespVo> courseRecordList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<CoursePurchasedRecordRespVo> getCourseRecordList() {
        return courseRecordList;
    }

    public void setCourseRecordList(List<CoursePurchasedRecordRespVo> courseRecordList) {
        this.courseRecordList = courseRecordList;
    }
}
