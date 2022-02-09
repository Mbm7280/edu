package com.lagou.edu.course.api.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * * @since 2020-06-11
 */
////@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class MediaDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 课程Id
     */
    private Integer courseId;

    /**
     * 章ID
     */
    private Integer sectionId;

    /**
     * 课时ID
     */
    private Integer lessonId;

    /**
     * 媒体渠道，1-阿里云，2-腾讯云，3-七牛云
     */
    private Integer channel;

    /**
     * 媒体类型，0-音频，1-视频
     */
    private Integer mediaType;

    /**
     * 封面图URL
     */
    private String coverImageUrl;

    /**
     * 时长（06:02）
     */
    private String duration;

    /**
     * 媒体资源唯一标识
     */
    private String fileId;
    /**
     * 媒体资源url地址
     */
    private String fileUrl;

    /**
     * 媒体资源文件对应的EDK
     */
    private String fileEdk;

    /**
     * 文件大小MB
     */
    private Double fileSize;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 媒体资源文件对应的DK
     */
    private String fileDk;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 媒体状态
     */
    private Integer status;

    /**
     * 是否删除，0未删除，1删除
     */
    private Boolean isDel;

    /**
     * 最后操作者ID
     */
    private Integer lastOperatorId;

    /**
     * 时长，秒数（主要用于音频在H5控件中使用）
     */
    private Integer durationNum;


    public MediaDTO() {
    }

    public MediaDTO(Integer id, Integer courseId, Integer sectionId, Integer lessonId, Integer channel, Integer mediaType, String coverImageUrl, String duration, String fileId, String fileUrl, String fileEdk, Double fileSize, String fileName, String fileDk, LocalDateTime createTime, LocalDateTime updateTime, Integer status, Boolean isDel, Integer lastOperatorId, Integer durationNum) {
        this.id = id;
        this.courseId = courseId;
        this.sectionId = sectionId;
        this.lessonId = lessonId;
        this.channel = channel;
        this.mediaType = mediaType;
        this.coverImageUrl = coverImageUrl;
        this.duration = duration;
        this.fileId = fileId;
        this.fileUrl = fileUrl;
        this.fileEdk = fileEdk;
        this.fileSize = fileSize;
        this.fileName = fileName;
        this.fileDk = fileDk;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
        this.isDel = isDel;
        this.lastOperatorId = lastOperatorId;
        this.durationNum = durationNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDk() {
        return fileDk;
    }

    public void setFileDk(String fileDk) {
        this.fileDk = fileDk;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean del) {
        isDel = del;
    }

    public Integer getLastOperatorId() {
        return lastOperatorId;
    }

    public void setLastOperatorId(Integer lastOperatorId) {
        this.lastOperatorId = lastOperatorId;
    }

    public Integer getDurationNum() {
        return durationNum;
    }

    public void setDurationNum(Integer durationNum) {
        this.durationNum = durationNum;
    }
}
