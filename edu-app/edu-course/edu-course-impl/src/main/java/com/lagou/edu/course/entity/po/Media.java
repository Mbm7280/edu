package com.lagou.edu.course.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author leo
 * @since 2020-06-17
 */
////@Data
@EqualsAndHashCode(callSuper = false)
@TableName("course_media")
public class Media implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 课程媒体主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
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
     * 封面图URL
     */
    private String coverImageUrl;

    /**
     * 时长（06:02）
     */
    private String duration;

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
     * 是否删除，0未删除，1删除
     */
    private Boolean isDel;

    /**
     * 时长，秒数（主要用于音频在H5控件中使用）
     */
    private Integer durationNum;

    /**
     * 媒体资源文件ID
     */
    private String fileId;

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

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean del) {
        isDel = del;
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
}
