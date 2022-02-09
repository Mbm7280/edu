package com.junode.edu.front.pay.vo.response;

import java.math.BigDecimal;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;

/**
 * @author: ma wei long
 * @date:   2020年6月24日 下午2:32:09
 */
//@Data
@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public class PayInfoVo {

	@ApiModelProperty(value = "价格, 单位元")
    private BigDecimal price;
	
    @ApiModelProperty(value = "当前订单支持的支付渠道信息")
    private List<OrderSupportChannel> supportChannels;

    public PayInfoVo() {
    }

    public PayInfoVo(BigDecimal price, List<OrderSupportChannel> supportChannels) {
        this.price = price;
        this.supportChannels = supportChannels;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<OrderSupportChannel> getSupportChannels() {
        return supportChannels;
    }

    public void setSupportChannels(List<OrderSupportChannel> supportChannels) {
        this.supportChannels = supportChannels;
    }
}
