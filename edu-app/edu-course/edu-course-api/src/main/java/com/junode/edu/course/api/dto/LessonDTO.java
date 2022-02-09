package com.junode.edu.course.api.dto;

import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 课程节内容
 * </p>
 *
 * * @since 2020-06-11
 */
////@Data
@EqualsAndHashCode(callSuper = false)
public class LessonDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 章节id
     */
    private Integer sectionId;

    /**
     * 课时主题
     */
    private String theme;

    /**
     * 课时时长 HH:ss
     */
    private String duration;
    /**
     * 课时时长
     */
    private Integer durationNum;
    /**
     * 是否免费
     */
    private Boolean isFree;

    /**
     * 课时背景图
     */
    private String startImgUrl;

    /**
     * 课时内容
     */
    private String textContent;

    /**
     * 课时内容（markdown文本）
     */
    private String markdownTextContent;

    /**
     * 转码集合
     */
    private String transcode;

    /**
     * 课程资源路径
     */
    private String resourceUrl;

    /**
     * 最后操作者id
     */
    private Integer lastOperatorId;

    /**
     * 记录创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 是否删除
     */
    private Boolean isDel;

    /**
     * 文件id
     */
    private String fileId;

    /**
     * 排序字段
     */
    private Integer orderNum;

    /**
     * 阿里云视频文件URL
     */
    private String aliFileUrl;

    /**
     * 阿里云视频文件的DK
     */
    private String aliFileDk;

    /**
     * 阿里云视频文件的EDK
     */
    private String aliFileEdk;

    /**
     * 阿里云视频资源文件ID
     */
    private String aliFileVid;

    /**
     * 课时状态,0-隐藏，1-未发布，2-已发布
     */
    private Integer status;

    /**
     * 是否定时发布
     */
    private Boolean isTimingPublish;

    /**
     * 定时发布时间
     */
    private LocalDateTime publishTime;

    /**
     * 课程对应的视频信息
     */
    private MediaDTO mediaDTO;

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

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
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

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean free) {
        isFree = free;
    }

    public String getStartImgUrl() {
        return startImgUrl;
    }

    public void setStartImgUrl(String startImgUrl) {
        this.startImgUrl = startImgUrl;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public String getMarkdownTextContent() {
        return markdownTextContent;
    }

    public void setMarkdownTextContent(String markdownTextContent) {
        this.markdownTextContent = markdownTextContent;
    }

    public String getTranscode() {
        return transcode;
    }

    public void setTranscode(String transcode) {
        this.transcode = transcode;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public Integer getLastOperatorId() {
        return lastOperatorId;
    }

    public void setLastOperatorId(Integer lastOperatorId) {
        this.lastOperatorId = lastOperatorId;
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

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean del) {
        isDel = del;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getAliFileUrl() {
        return aliFileUrl;
    }

    public void setAliFileUrl(String aliFileUrl) {
        this.aliFileUrl = aliFileUrl;
    }

    public String getAliFileDk() {
        return aliFileDk;
    }

    public void setAliFileDk(String aliFileDk) {
        this.aliFileDk = aliFileDk;
    }

    public String getAliFileEdk() {
        return aliFileEdk;
    }

    public void setAliFileEdk(String aliFileEdk) {
        this.aliFileEdk = aliFileEdk;
    }

    public String getAliFileVid() {
        return aliFileVid;
    }

    public void setAliFileVid(String aliFileVid) {
        this.aliFileVid = aliFileVid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getTimingPublish() {
        return isTimingPublish;
    }

    public void setTimingPublish(Boolean timingPublish) {
        isTimingPublish = timingPublish;
    }

    public LocalDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(LocalDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public MediaDTO getMediaDTO() {
        return mediaDTO;
    }

    public void setMediaDTO(MediaDTO mediaDTO) {
        this.mediaDTO = mediaDTO;
    }
}
