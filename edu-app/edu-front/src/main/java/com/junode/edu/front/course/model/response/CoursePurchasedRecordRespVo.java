package com.junode.edu.front.course.model.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

////@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CoursePurchasedRecordRespVo implements Serializable {
    @ApiModelProperty(value = "更新进度")
    private String updateProgress;
    @ApiModelProperty(value = "更新提醒")
    private String updateTips;
    @ApiModelProperty(value = "课时更新数")
    private int lessonUpdateNum;
    @ApiModelProperty(value = "课程Id")
    private Integer id;
    @ApiModelProperty(value = "课程名称")
    private String name;
    @ApiModelProperty(value = "最近学习的课时名称")
    private String lastLearnLessonName;
    @ApiModelProperty(value = "图片链接")
    private String image;
    @ApiModelProperty("课程预览第一个字段")
    String previewFirstField ;
    @ApiModelProperty("课程预览第二个字段")
    String previewSecondField;

    public String getUpdateProgress() {
        return updateProgress;
    }

    public void setUpdateProgress(String updateProgress) {
        this.updateProgress = updateProgress;
    }

    public String getUpdateTips() {
        return updateTips;
    }

    public void setUpdateTips(String updateTips) {
        this.updateTips = updateTips;
    }

    public int getLessonUpdateNum() {
        return lessonUpdateNum;
    }

    public void setLessonUpdateNum(int lessonUpdateNum) {
        this.lessonUpdateNum = lessonUpdateNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastLearnLessonName() {
        return lastLearnLessonName;
    }

    public void setLastLearnLessonName(String lastLearnLessonName) {
        this.lastLearnLessonName = lastLearnLessonName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPreviewFirstField() {
        return previewFirstField;
    }

    public void setPreviewFirstField(String previewFirstField) {
        this.previewFirstField = previewFirstField;
    }

    public String getPreviewSecondField() {
        return previewSecondField;
    }

    public void setPreviewSecondField(String previewSecondField) {
        this.previewSecondField = previewSecondField;
    }
}
