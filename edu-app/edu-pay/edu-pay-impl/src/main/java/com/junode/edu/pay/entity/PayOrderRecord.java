package com.junode.edu.pay.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: ma wei long
 * @date:   2020年6月22日 上午12:21:07
 */
//@Data
@EqualsAndHashCode(callSuper = false)
public class PayOrderRecord implements Serializable {
    /**
	 */
	private static final long serialVersionUID = 2885827689318298300L;
	
    @TableId(value = "id", type = IdType.AUTO)
	private Long id;//主键
    private String orderNo;//订单号
    private String type;//操作类型CREATE|PAY|REFUND...	
    private String fromStatus;//原订单状态
    private String toStatus;//新订单状态
    private Integer paidAmount;//实付金额，单位为分
    private String remark;//备注
    private String createdBy;//操作人
    private Date createdAt;//操作时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFromStatus() {
        return fromStatus;
    }

    public void setFromStatus(String fromStatus) {
        this.fromStatus = fromStatus;
    }

    public String getToStatus() {
        return toStatus;
    }

    public void setToStatus(String toStatus) {
        this.toStatus = toStatus;
    }

    public Integer getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
