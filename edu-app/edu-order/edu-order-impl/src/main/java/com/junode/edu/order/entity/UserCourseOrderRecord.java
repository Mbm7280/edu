package com.junode.edu.order.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Description:(商品订单日志表)   
 * @author: ma wei long
 * @date:   2020年6月18日 下午5:02:29
*/
//@Data
@EqualsAndHashCode(callSuper = false)
public class UserCourseOrderRecord implements Serializable {

	/**
	 */
	private static final long serialVersionUID = -7570167955274135869L;
	
	/**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String orderNo;//订单号 唯一
    private String fromStatus;//原订单状态
    private String toStatus;//新订单状态
    private String remark;//备注
    private Date createTime;//创建时间
    private String createUser;//创建人
    private Date updateTime;//更新时间
    private String updateUser;//更新人

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}
