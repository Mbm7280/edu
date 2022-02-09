package com.junode.edu.course.api.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;
////@Data
@EqualsAndHashCode(callSuper = false)
public class CoursePlayHistoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 章节id
     */
    private Integer sectionId;

    /**
     * 课时id
     */
    private Integer lessonId;

    /**
     * 历史播放节点(s)
     */
    private Integer historyNode;

    /**
     * 最高历史播放节点
     */
    private Integer historyHighestNode;

    /**
     * 记录创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public Integer getHistoryNode() {
        return historyNode;
    }

    public void setHistoryNode(Integer historyNode) {
        this.historyNode = historyNode;
    }

    public Integer getHistoryHighestNode() {
        return historyHighestNode;
    }

    public void setHistoryHighestNode(Integer historyHighestNode) {
        this.historyHighestNode = historyHighestNode;
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
}