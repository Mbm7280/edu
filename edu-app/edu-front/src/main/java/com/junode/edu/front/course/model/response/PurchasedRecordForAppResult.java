package com.junode.edu.front.course.model.response;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

//@Data
public class PurchasedRecordForAppResult {
    @ApiModelProperty("课程购买记录列表")
    List<AllCoursePurchasedRecordRespVo> allCoursePurchasedRecord;

    public List<AllCoursePurchasedRecordRespVo> getAllCoursePurchasedRecord() {
        return allCoursePurchasedRecord;
    }

    public void setAllCoursePurchasedRecord(List<AllCoursePurchasedRecordRespVo> allCoursePurchasedRecord) {
        this.allCoursePurchasedRecord = allCoursePurchasedRecord;
    }
}
