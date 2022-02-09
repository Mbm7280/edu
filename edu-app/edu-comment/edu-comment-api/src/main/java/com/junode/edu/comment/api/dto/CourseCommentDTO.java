package com.junode.edu.comment.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

////@Data
//@AllArgsConstructor
//@NoArgsConstructor

public class CourseCommentDTO {

    private String id;

    private Integer courseId;

    private Integer userId;

    private String comment;

    private boolean isOwner = false;

    private String nickName;

    private boolean favoriteTag;

    private Integer likeCount;

    public CourseCommentDTO() {
    }

    public CourseCommentDTO(String id, Integer courseId, Integer userId, String comment, boolean isOwner, String nickName, boolean favoriteTag, Integer likeCount) {
        this.id = id;
        this.courseId = courseId;
        this.userId = userId;
        this.comment = comment;
        this.isOwner = isOwner;
        this.nickName = nickName;
        this.favoriteTag = favoriteTag;
        this.likeCount = likeCount;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setOwner(boolean owner) {
        isOwner = owner;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public boolean isFavoriteTag() {
        return favoriteTag;
    }

    public void setFavoriteTag(boolean favoriteTag) {
        this.favoriteTag = favoriteTag;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }
}