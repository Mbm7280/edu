package com.lagou.edu.pay.api.dto;

import java.io.Serializable;
import java.util.List;

import com.lagou.edu.pay.api.enums.Source;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 支付请求对象   
 * ma wei long
 * 2020年6月17日 下午3:30:52
 */
//@Data
@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public class PayReqDTO  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4832273272836171358L;
	private String goodsOrderNo;//商品订单编号
    private String channel;//渠道(weChat-微信支付，AliPay-支付宝支付)
    private String returnUrl;//h5支付成功回调地址
    private Integer wxType;//如果是从微信浏览器过来的话，则使用该参数来获取真正的openId参数
    private Integer userid;//用户ID
    private Source source;// 支付来源
    private String clientIp;// 客户端IP地址
    private String openId;// JSAPI微信公众号支付用户的唯一标识

    public PayReqDTO() {
    }

    public PayReqDTO(String goodsOrderNo, String channel, String returnUrl, Integer wxType, Integer userid, Source source, String clientIp, String openId) {
        this.goodsOrderNo = goodsOrderNo;
        this.channel = channel;
        this.returnUrl = returnUrl;
        this.wxType = wxType;
        this.userid = userid;
        this.source = source;
        this.clientIp = clientIp;
        this.openId = openId;
    }

    public String getGoodsOrderNo() {
        return goodsOrderNo;
    }

    public void setGoodsOrderNo(String goodsOrderNo) {
        this.goodsOrderNo = goodsOrderNo;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public Integer getWxType() {
        return wxType;
    }

    public void setWxType(Integer wxType) {
        this.wxType = wxType;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}