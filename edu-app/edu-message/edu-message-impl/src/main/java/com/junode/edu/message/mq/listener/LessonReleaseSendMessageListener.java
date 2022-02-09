package com.junode.edu.message.mq.listener;

import java.util.List;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

import com.junode.edu.common.constant.MQConstant;
import com.junode.edu.common.mq.dto.BaseMqDTO;
import com.junode.edu.common.mq.listener.AbstractMqListener;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component
@RocketMQMessageListener(topic = MQConstant.Topic.LESSON_RELEASE_SEND_MESSAGE, consumerGroup = "${rocketmq.producer.group}" + "_" + MQConstant.Topic.LESSON_RELEASE_SEND_MESSAGE)
public class LessonReleaseSendMessageListener extends AbstractMqListener<BaseMqDTO<List<Integer>>> implements RocketMQListener<BaseMqDTO<List<Integer>>>{
	

    @Override
    public void onMessage(BaseMqDTO<List<Integer>> data) {

    }
}