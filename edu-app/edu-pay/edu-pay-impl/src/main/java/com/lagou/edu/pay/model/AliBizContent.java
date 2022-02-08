package com.lagou.edu.pay.model;


import lombok.Builder;
import lombok.Data;

/**
 * @author Piaoxu
 * @since 2019/4/2-16:36
 **/
//@Data
@Builder
public class AliBizContent {
    private String out_trade_no;
    private String product_code;
    private String subject;
    private Double total_amount;

    private String quit_url;  //手机网站支付必须参数

    private String qr_pay_mode;
    private Integer qrcode_width;

    //退款参数
    private Double refund_amount;
    private String refund_reason;

    // 扩展信息
    private AliBizExtendContent extend_params;

    // 查询是用于查询支付渠道信息
    private String[] query_options;

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }

    public String getQuit_url() {
        return quit_url;
    }

    public void setQuit_url(String quit_url) {
        this.quit_url = quit_url;
    }

    public String getQr_pay_mode() {
        return qr_pay_mode;
    }

    public void setQr_pay_mode(String qr_pay_mode) {
        this.qr_pay_mode = qr_pay_mode;
    }

    public Integer getQrcode_width() {
        return qrcode_width;
    }

    public void setQrcode_width(Integer qrcode_width) {
        this.qrcode_width = qrcode_width;
    }

    public Double getRefund_amount() {
        return refund_amount;
    }

    public void setRefund_amount(Double refund_amount) {
        this.refund_amount = refund_amount;
    }

    public String getRefund_reason() {
        return refund_reason;
    }

    public void setRefund_reason(String refund_reason) {
        this.refund_reason = refund_reason;
    }

    public AliBizExtendContent getExtend_params() {
        return extend_params;
    }

    public void setExtend_params(AliBizExtendContent extend_params) {
        this.extend_params = extend_params;
    }

    public String[] getQuery_options() {
        return query_options;
    }

    public void setQuery_options(String[] query_options) {
        this.query_options = query_options;
    }
}
