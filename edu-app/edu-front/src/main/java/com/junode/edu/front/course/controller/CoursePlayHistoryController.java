package com.junode.edu.front.course.controller;

import com.alibaba.fastjson.JSON;
import com.junode.edu.front.common.UserManager;
import com.junode.edu.front.course.model.request.CoursePlayHistoryReq;
import com.junode.edu.common.result.ResponseDTO;
import com.junode.edu.common.result.ResultCode;
import com.junode.edu.course.api.CoursePlayHistoryRemoteService;
import com.junode.edu.course.api.dto.CoursePlayHistoryDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Author:   mkp
 * Date:     2020/6/24 14:12
 * Description: 历史节点
 */

@Api(tags = "课程播放历史接口")
@Slf4j
@RestController
@RequestMapping("/course/historyNode")
public class CoursePlayHistoryController {

    @Autowired
    private CoursePlayHistoryRemoteService coursePlayHistoryRemoteService;

    @ApiOperation(value = "保存历史节点")
    @PostMapping(value = "/saveCourseHistoryNode")
    ResponseDTO saveCourseHistoryNode(@RequestBody CoursePlayHistoryReq coursePlayHistoryReq) {
        try {
            Integer userId = UserManager.getUserId();
            log.info("保存历史节点 coursePlayHistoryReq:{}", JSON.toJSONString(coursePlayHistoryReq));
            CoursePlayHistoryDTO coursePlayHistoryDTO = new CoursePlayHistoryDTO();
            BeanUtils.copyProperties(coursePlayHistoryReq, coursePlayHistoryDTO);
            coursePlayHistoryDTO.setUserId(userId);
            log.info("保存历史节点数据 coursePlayHistoryDTO：{} ", JSON.toJSONString(coursePlayHistoryDTO));
            coursePlayHistoryRemoteService.saveCourseHistoryNode(coursePlayHistoryDTO);
            return ResponseDTO.success(ResultCode.SUCCESS.getState());
        } catch (Exception e) {
            return ResponseDTO.response(ResultCode.INTERNAL_ERROR.getState(), "分页查询失败", null);
        }
    }

    @ApiOperation(value = "获取课程播放节点")
    @GetMapping(value = "/getByLessonId")
    ResponseDTO getByLessonId(@RequestParam("lessonId") Integer lessonId) {
        try {
            Integer userId = UserManager.getUserId();
            CoursePlayHistoryDTO coursePlayHistoryDTO = coursePlayHistoryRemoteService.getByLessonId(lessonId,userId);
            return ResponseDTO.success(coursePlayHistoryDTO);
        } catch (Exception e) {
            return ResponseDTO.response(ResultCode.INTERNAL_ERROR.getState(), "获取课程播放节点 ", null);
        }
    }
}
