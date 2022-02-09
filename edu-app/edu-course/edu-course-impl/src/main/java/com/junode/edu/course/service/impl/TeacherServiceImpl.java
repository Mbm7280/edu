package com.junode.edu.course.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.junode.edu.course.entity.po.Teacher;
import com.junode.edu.course.mapper.TeacherMapper;
import com.junode.edu.course.service.ITeacherService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课程节内容 服务实现类
 * </p>
 *
 * * @since 2020-06-11
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

}
