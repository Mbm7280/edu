package com.junode.edu.pay.trade.request.wechatPay;

import com.junode.edu.pay.trade.request.BasePayRequest;

/**
 * @Description:(微信支付请求对象)   
 * @author: ma wei long
 * @date:   2020年6月19日 下午1:46:30
*/
//@Data
public class WechatPayRequest extends BasePayRequest{

	/**
	 */
	private static final long serialVersionUID = 3576969623603184306L;

	private String paramStr;

	public String getParamStr() {
		return paramStr;
	}

	public void setParamStr(String paramStr) {
		this.paramStr = paramStr;
	}
}
