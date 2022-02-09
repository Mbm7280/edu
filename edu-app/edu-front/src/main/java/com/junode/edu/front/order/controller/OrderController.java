package com.junode.edu.front.order.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.fastjson.JSON;
import com.junode.edu.common.result.ResponseDTO;
import com.junode.edu.common.util.ValidateUtils;
import com.junode.edu.front.common.UserManager;
import com.junode.edu.front.order.service.OrderService;
import com.junode.edu.front.order.vo.request.CreateShopGoodsOrderReqVo;
import com.junode.edu.front.order.vo.response.CreateShopGoodsOrderResVo;
import com.junode.edu.front.utils.ExceptionUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description:(订单控制器)   
 * @author: ma wei long
 * @date:   2020年6月16日 下午2:47:07
*/
@Slf4j
@RestController
@RequestMapping("/order")
@Api(description = "商品下单相关接口", tags = "订单接口")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	/**
     * @Description: (创建商品订单订单)   
     * @author: ma wei long
     * @date:   2020年6月17日 下午3:33:18   
    */
    @ApiOperation("创建商品订单")
    @PostMapping("/saveOrder")
	@SentinelResource(value = "saveOrder", blockHandler = "saveOrderHandleException", blockHandlerClass = {ExceptionUtil.class})
    public ResponseDTO<CreateShopGoodsOrderResVo> saveOrder(@RequestBody CreateShopGoodsOrderReqVo reqVo, HttpServletRequest request) {
    	log.info("saveOrder - reqVo:{}",JSON.toJSONString(reqVo));
		ValidateUtils.notNullParam(reqVo);
		reqVo.setUserId(UserManager.getUserId());
        return ResponseDTO.success(orderService.saveOrder(reqVo));
    }
}
