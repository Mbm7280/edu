package com.junode.edu.oauth.mult.authenticator.sms.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.junode.edu.oauth.exception.CustomOauthExceptionSerializer;
import com.junode.edu.oauth.mult.authenticator.sms.result.SmsCodeValidateResult;
import lombok.EqualsAndHashCode;

//@Data
@EqualsAndHashCode(callSuper = true)
@JsonSerialize(using = CustomOauthExceptionSerializer.class)
public class SmsValidateException extends RuntimeException {
    private SmsCodeValidateResult result;

    public SmsCodeValidateResult getResult() {
        return result;
    }

    public void setResult(SmsCodeValidateResult result) {
        this.result = result;
    }

    public SmsValidateException(SmsCodeValidateResult result) {
        this.result = result;
    }
}
