package com.junode.edu.front.course.service;

import com.junode.edu.front.course.model.response.CourseSectionListResult;

public interface SectionService {
    CourseSectionListResult getSectionInfoByCourseId(Integer userId, Integer courseId);
}
