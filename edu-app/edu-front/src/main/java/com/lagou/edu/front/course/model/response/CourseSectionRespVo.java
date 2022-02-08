package com.lagou.edu.front.course.model.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

//@Data
public class CourseSectionRespVo {
    @ApiModelProperty("课程章节ID")
    private int id;
    @ApiModelProperty("课程ID")
    private Integer courseId;
    @ApiModelProperty("章节名称")
    private String sectionName;
    @ApiModelProperty("章节描述")
    private String description;
    @ApiModelProperty("0:隐藏；1：待更新；2：已发布")
    private Integer status;
    @ApiModelProperty("课程章节下的课时列表")
    private List<CourseLessonRespVo> courseLessons = new LinkedList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<CourseLessonRespVo> getCourseLessons() {
        return courseLessons;
    }

    public void setCourseLessons(List<CourseLessonRespVo> courseLessons) {
        this.courseLessons = courseLessons;
    }
}
