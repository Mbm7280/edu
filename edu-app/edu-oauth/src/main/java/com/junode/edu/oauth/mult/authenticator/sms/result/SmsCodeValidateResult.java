package com.junode.edu.oauth.mult.authenticator.sms.result;

import com.junode.edu.oauth.exception.AuthErrorType;

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
