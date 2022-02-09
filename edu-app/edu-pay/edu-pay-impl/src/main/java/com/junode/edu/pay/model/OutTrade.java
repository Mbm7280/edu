package com.junode.edu.pay.model;

import java.util.Date;
import java.util.Map;

import com.junode.edu.pay.api.enums.Status;

import lombok.Builder;

/**
 * @author Piaoxu
 * @since 2019/4/1-15:25
 **/

//@Data
@Builder
public class OutTrade {
    private String orderNo;
    private String outTradeNo;
    private Status status;
    private String msg;
    private String buyId;
    private Date payTime;
    private Map<String, String> extra;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getBuyId() {
        return buyId;
    }

    public void setBuyId(String buyId) {
        this.buyId = buyId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Map<String, String> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, String> extra) {
        this.extra = extra;
    }
}
