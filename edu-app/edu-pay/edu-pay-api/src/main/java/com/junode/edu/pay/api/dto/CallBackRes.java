package com.junode.edu.pay.api.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: ma wei long
 * @date:   2020年6月22日 下午4:35:11
 */
//@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
public class CallBackRes implements Serializable {

    private static final long serialVersionUID = -1494134899283606056L;
    private String resStr;//返回结果

    public CallBackRes() {
    }

    public CallBackRes(String resStr) {
        this.resStr = resStr;
    }

    public String getResStr() {
        return resStr;
    }

    public void setResStr(String resStr) {
        this.resStr = resStr;
    }
}
