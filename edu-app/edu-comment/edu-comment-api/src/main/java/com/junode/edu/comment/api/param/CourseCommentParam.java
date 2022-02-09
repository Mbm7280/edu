package com.junode.edu.comment.api.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;

/**
 * Author:   mkp
 * Date:     2020/7/7 11:00
 * Description: 评论查询参数
 */
////@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class CourseCommentParam  implements Serializable    {
    private Integer userId;
    private Integer courseId;
    private int pageNum;
    private int pageSize;

    public CourseCommentParam() {
    }

    public CourseCommentParam(Integer userId, Integer courseId, int pageNum, int pageSize) {
        this.userId = userId;
        this.courseId = courseId;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

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

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
