package com.junode.edu.pay.trade.response;

import java.io.Serializable;

import com.junode.edu.pay.model.OutTrade;

/**
 * @Description:(支付基础响应对象)   
 * @author: ma wei long
 * @date:   2020年6月19日 下午1:47:34
*/
//@Data
public class BasePayResponse implements Serializable{

	/**
	 */
	private static final long serialVersionUID = 942497671183248456L;
	public boolean isSuccess() {return true;};
	private String url;
	private OutTrade trade;
	private String resStr;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public OutTrade getTrade() {
		return trade;
	}

	public void setTrade(OutTrade trade) {
		this.trade = trade;
	}

	public String getResStr() {
		return resStr;
	}

	public void setResStr(String resStr) {
		this.resStr = resStr;
	}
}
