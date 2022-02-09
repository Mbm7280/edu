package com.junode.edu.comment.service;

import com.junode.edu.comment.entity.CourseCommentFavorite;

import java.util.List;

public interface ICourseCommentFavoriteService {
    List<CourseCommentFavorite> getCommentFavoriteRecordList(Integer userId, List<String> parentIds);
}
