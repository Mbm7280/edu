package com.lagou.edu.pay.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 支付宝支付PC端配置
 * @author: ma wei long
 * @date:   2020年7月13日 下午5:34:13
*/
//@Data
@ConfigurationProperties(prefix = "pay.alipay.pc")
@Component
public class AliPayMchConfig {
	private String appId;
	private String mchId;
    private String privateKey;
    private String publicKey;
    private String payHost;
    private String notifyUrl;
    private String signType;
    public Boolean useFakeMoney;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPayHost() {
        return payHost;
    }

    public void setPayHost(String payHost) {
        this.payHost = payHost;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public Boolean getUseFakeMoney() {
        return useFakeMoney;
    }

    public void setUseFakeMoney(Boolean useFakeMoney) {
        this.useFakeMoney = useFakeMoney;
    }
}
