package com.junode.edu.message.mq.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

import com.junode.edu.common.constant.MQConstant;
import com.junode.edu.common.mq.dto.BaseMqDTO;
import com.junode.edu.common.mq.listener.AbstractMqListener;
import com.junode.edu.message.api.dto.LessonStatusReleaseDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RocketMQMessageListener(topic = MQConstant.Topic.LESSON_STATUS_RELEASE, consumerGroup = "${rocketmq.producer.group}" + "_" + MQConstant.Topic.LESSON_STATUS_RELEASE)
public class LessonStatusReleaseListener extends AbstractMqListener<BaseMqDTO<LessonStatusReleaseDTO>> implements RocketMQListener<BaseMqDTO<LessonStatusReleaseDTO>>{
	

	
    @Override
    public void onMessage(BaseMqDTO<LessonStatusReleaseDTO> data) {

    }
}