package com.junode.edu.front.course.service;

import com.junode.edu.front.course.model.response.CoursePurchasedRecordRespVo;

import java.util.List;

public interface CourseService {
    List<CoursePurchasedRecordRespVo> getAllCoursePurchasedRecord(Integer userId);
}
