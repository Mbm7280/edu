package com.junode.edu.pay.trade.request.aliPay;

import java.util.Map;

import com.junode.edu.pay.trade.request.BasePayRequest;

/**
 * @Description:(支付宝请求类)   
 * @author: ma wei long
 * @date:   2020年6月19日 下午1:45:32
*/
//@Data
public class AliPayRequest extends BasePayRequest{

	/**
	 */
	private static final long serialVersionUID = 9141311458270746945L;
	
	private Map<String, String> params;

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}
}
