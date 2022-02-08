package com.lagou.edu.oauth.mult.authenticator.sms.result;

import com.lagou.edu.oauth.exception.AuthErrorType;
import lombok.Data;

//@Data
public class SmsCodeValidateResult {
    private boolean success = true;
    private AuthErrorType authErrorType;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public AuthErrorType getAuthErrorType() {
        return authErrorType;
    }

    public void setAuthErrorType(AuthErrorType authErrorType) {
        this.authErrorType = authErrorType;
    }
}
