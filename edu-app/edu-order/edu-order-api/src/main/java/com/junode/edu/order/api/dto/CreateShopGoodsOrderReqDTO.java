package com.junode.edu.order.api.dto;

import com.junode.edu.order.api.enums.UserCourseOrderSourceType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @Description:(创建商城商品订单的请求)   
 * @author: ma wei long
 * @date:   2020年6月18日 下午7:35:42
*/
//@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateShopGoodsOrderReqDTO implements java.io.Serializable{
	
	/**
	 */
	private static final long serialVersionUID = 6507306131413105949L;
    private Integer goodsId;//商品id
    private Integer userId;//用户id
    private UserCourseOrderSourceType sourceType;//订单来源

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public UserCourseOrderSourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(UserCourseOrderSourceType sourceType) {
        this.sourceType = sourceType;
    }
}
