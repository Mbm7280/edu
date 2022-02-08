package com.lagou.edu.course.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author leo
 * @since 2020-06-11
 */
////@Data
@EqualsAndHashCode(callSuper = false)
public class SectionDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 章节名
     */
    private String sectionName;

    /**
     * 章节描述
     */
    private String description;

    /**
     * 记录创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 是否可见
     */
    private Boolean isVisible;

    /**
     * 是否删除
     */
    private Boolean isDe;

    /**
     * 排序字段
     */
    private Integer orderNum;

    /**
     * 最后操作者ID
     */
    private Integer lastOperatorId;

    /**
     * 状态，0:隐藏；1：待更新；2：已发布
     */
    private Integer status;

    /**
     * 模块关联的课程
     */
    private List<LessonDTO> lessonDTOS;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getVisible() {
        return isVisible;
    }

    public void setVisible(Boolean visible) {
        isVisible = visible;
    }

    public Boolean getDe() {
        return isDe;
    }

    public void setDe(Boolean de) {
        isDe = de;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getLastOperatorId() {
        return lastOperatorId;
    }

    public void setLastOperatorId(Integer lastOperatorId) {
        this.lastOperatorId = lastOperatorId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<LessonDTO> getLessonDTOS() {
        return lessonDTOS;
    }

    public void setLessonDTOS(List<LessonDTO> lessonDTOS) {
        this.lessonDTOS = lessonDTOS;
    }
}
