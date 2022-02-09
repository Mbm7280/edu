package com.junode.edu.pay.trade.impl;

import java.util.Map;

import com.junode.edu.pay.trade.AbstractThirdPayServer;
import com.junode.edu.pay.trade.ThirdPayServer;
import com.junode.edu.pay.trade.ThirdPayService;
import com.junode.edu.pay.trade.request.BasePayRequest;
import com.junode.edu.pay.trade.request.aliPay.AliPayRequest;
import com.junode.edu.pay.trade.request.wechatPay.WechatPayRequest;
import com.junode.edu.pay.trade.response.BasePayResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junode.edu.common.util.ConvertUtils;
import com.junode.edu.common.util.ValidateUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:(三方支付service)   
 * @author: ma wei long
 * @date:   2020年6月19日 下午2:08:17
*/
@Slf4j
@Service
public class ThirdPayServiceImpl implements ThirdPayService {
	
	@Autowired
	private Map<String, ThirdPayServer<?,?>> thirdPayServerMap;
	
	@Override
	public BasePayResponse submitPay(BasePayRequest request) {
		ThirdPayServer thirdPayServer = thirdPayServerMap.get(StringUtils.join(request.getChannel(), AbstractThirdPayServer.PAY_SERVER));
		ValidateUtils.isTrue(null != thirdPayServer, "未找到对应的支付服务");
		if(thirdPayServer instanceof AliPayServer) {
			request = ConvertUtils.convert(request, AliPayRequest.class);
		}else if(thirdPayServer instanceof WechatPayServer) {
			request = ConvertUtils.convert(request, WechatPayRequest.class);
		}
		return thirdPayServer.submitPay(request);
	}

	@Override
	public BasePayResponse callBack(BasePayRequest request) {
		ThirdPayServer thirdPayServer = thirdPayServerMap.get(StringUtils.join(request.getChannel(),AbstractThirdPayServer.PAY_SERVER));
		ValidateUtils.isTrue(null != thirdPayServer, "未找到对应的支付服务");
		if(thirdPayServer instanceof AliPayServer) {
			request = ConvertUtils.convert(request, AliPayRequest.class);
		}else if(thirdPayServer instanceof WechatPayServer) {
			request = ConvertUtils.convert(request, WechatPayRequest.class);
		}
		return thirdPayServer.callBack(request);
	}
}
