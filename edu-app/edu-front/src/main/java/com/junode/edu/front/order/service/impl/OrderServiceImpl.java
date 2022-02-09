package com.junode.edu.front.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.boot.autoconfigure.klock.model.LockTimeoutStrategy;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.junode.edu.common.result.ResponseDTO;
import com.junode.edu.common.util.ConvertUtils;
import com.junode.edu.common.util.ValidateUtils;
import com.junode.edu.front.order.service.OrderService;
import com.junode.edu.front.order.vo.request.CreateShopGoodsOrderReqVo;
import com.junode.edu.front.order.vo.response.CreateShopGoodsOrderResVo;
import com.junode.edu.order.api.UserCourseOrderRemoteService;
import com.junode.edu.order.api.dto.CreateShopGoodsOrderReqDTO;
import com.junode.edu.order.api.dto.UserCourseOrderResDTO;
import com.junode.edu.order.api.enums.UserCourseOrderSourceType;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:(支付service)
 * @author: ma wei long
 * @date: 2020年6月17日 下午5:03:19
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private UserCourseOrderRemoteService userCourseOrderRemoteService;
	
	/**
	 * @Description: (创建商品订单)   
	 * @author: ma wei long
	 * @date:   2020年6月18日 下午7:40:30   
	*/
	@Override
	@Klock(keys = {"#reqVo.userId","#reqVo.goodsId"}, waitTime = 0 ,leaseTime = 120,lockTimeoutStrategy = LockTimeoutStrategy.FAIL_FAST)
	public CreateShopGoodsOrderResVo saveOrder(CreateShopGoodsOrderReqVo reqVo) {
		ValidateUtils.notNullParam(reqVo);
		ValidateUtils.notNullParam(reqVo.getGoodsId());
		CreateShopGoodsOrderReqDTO req = ConvertUtils.convert(reqVo, CreateShopGoodsOrderReqDTO.class);
		req.setSourceType(UserCourseOrderSourceType.USER_BUY);
		ResponseDTO<UserCourseOrderResDTO> resp = userCourseOrderRemoteService.saveOrder(req);
		log.info("saveOrder - userCourseOrderRemoteService.saveOrder - req:{} resp:{}",JSON.toJSONString(req),JSON.toJSONString(resp));
		ValidateUtils.isTrue(resp.isSuccess(), resp.getState(),resp.getMessage());
		return ConvertUtils.convert(resp.getContent(), CreateShopGoodsOrderResVo.class);
	}
}
