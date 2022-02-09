package com.junode.edu.course.controller;

import com.junode.edu.course.api.dto.CourseDTO;
import com.junode.edu.course.remote.CourseService;
import com.junode.edu.course.api.dto.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;


    /**
     * 获取选课列表
     * @param userId
     * @return
     */
    @GetMapping("/getAllCourses")
    public List<CourseDTO> getAllCourses(@RequestParam(required = false,name = "userId") Integer userId) {
        return  courseService.getAllCourses(userId);
    }

  
    /**
     * 获取已购课程信息
     * @param userId
     * @return
     */
    @GetMapping("/getPurchasedCourse")
    List<CourseDTO> getPurchasedCourse(@RequestParam("userId") Integer userId){
        return  courseService.getPurchasedCourse(userId);
    }



}
