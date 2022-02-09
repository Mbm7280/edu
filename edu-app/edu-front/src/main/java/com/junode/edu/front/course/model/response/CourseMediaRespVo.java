package com.junode.edu.front.course.model.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

////@Data
public class CourseMediaRespVo {
    @ApiModelProperty("课程媒体ID")
    private Integer id;
    @ApiModelProperty("媒体渠道")
    private Integer channel;
    @ApiModelProperty("媒体类型")
    private Integer mediaType;
    @ApiModelProperty("音频封面图")
    private String coverImageUrl;
    @ApiModelProperty("格式化后的音视频时长")
    private String duration;
    @ApiModelProperty("音视频时长")
    private Integer durationNum;
    @ApiModelProperty("音视频fileID")
    private String fileId;
    @ApiModelProperty("音频或视频fileUrl")
    private String fileUrl;
    @ApiModelProperty("媒体文件对应的EDK")
    private String fileEdk;
    @ApiModelProperty("媒体文件大小")
    private Double fileSize;
    @ApiModelProperty("是否免费")
    private boolean isFree;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getMediaType() {
        return mediaType;
    }

    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getDurationNum() {
        return durationNum;
    }

    public void setDurationNum(Integer durationNum) {
        this.durationNum = durationNum;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileEdk() {
        return fileEdk;
    }

    public void setFileEdk(String fileEdk) {
        this.fileEdk = fileEdk;
    }

    public Double getFileSize() {
        return fileSize;
    }

    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
