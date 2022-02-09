package com.junode.edu.front.course.model.response;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

//@Data
public class CourseSectionListResult {
    @ApiModelProperty("是否已购买")
    private boolean hasBuy=false;
    @ApiModelProperty("课程名称")
    private String courseName;
    @ApiModelProperty("课程封面图")
    private String coverImage;
    @ApiModelProperty("课程章节列表")
    List<CourseSectionRespVo> courseSectionList;

    public boolean isHasBuy() {
        return hasBuy;
    }

    public void setHasBuy(boolean hasBuy) {
        this.hasBuy = hasBuy;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public List<CourseSectionRespVo> getCourseSectionList() {
        return courseSectionList;
    }

    public void setCourseSectionList(List<CourseSectionRespVo> courseSectionList) {
        this.courseSectionList = courseSectionList;
    }
}
