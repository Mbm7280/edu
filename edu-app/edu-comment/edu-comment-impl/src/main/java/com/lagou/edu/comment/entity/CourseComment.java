package com.lagou.edu.comment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

////@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Document(collection = "course_comment")
public class CourseComment {

    @Id
    private String id;

    private Integer courseId;




    @Indexed
    private Integer userId;



    private Integer likeCount;


    private Date createTime;

    private Date updateTime;

    private Boolean isDel;


    private String comment;

    public CourseComment() {
    }

    public CourseComment(String id, Integer courseId, Integer userId, Integer likeCount, Date createTime, Date updateTime, Boolean isDel, String comment) {
        this.id = id;
        this.courseId = courseId;
        this.userId = userId;
        this.likeCount = likeCount;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isDel = isDel;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean del) {
        isDel = del;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}