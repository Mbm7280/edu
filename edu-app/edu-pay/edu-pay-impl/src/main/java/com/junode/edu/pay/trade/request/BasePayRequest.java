package com.junode.edu.pay.trade.request;

import java.io.Serializable;

import com.junode.edu.pay.api.enums.Source;
import com.junode.edu.pay.entity.PayOrder;

/**
 * @Description:(支付基础请求对象)   
 * @author: ma wei long
 * @date:   2020年6月19日 下午1:44:50
*/
//@Data
public class BasePayRequest implements Serializable{

	/**
	 */
	private static final long serialVersionUID = 5569293616840928106L;
	
	private String channel;//支付渠道
	private Source source;//来源
	private PayOrder order;//订单信息

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public PayOrder getOrder() {
		return order;
	}

	public void setOrder(PayOrder order) {
		this.order = order;
	}
}
