package com.junode.edu.course.service;

import com.junode.edu.course.entity.po.CoursePlayHistory;
import com.junode.edu.course.api.dto.CoursePlayHistoryDTO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * * @since 2020-06-19
 */
public interface ICoursePlayHistoryService extends IService<CoursePlayHistory> {

    CoursePlayHistory getByUserIdAndCourseId(Integer userId, Integer courseId);

    void saveCourseHistoryNode(CoursePlayHistoryDTO playHistoryDTO);
}
