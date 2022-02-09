package com.junode.edu.front.course.model.response;

import io.swagger.annotations.ApiModelProperty;

////@Data
public class CourseLessonRespVo {
    @ApiModelProperty("课时ID")
    private Integer id;
    @ApiModelProperty("课程ID")
    private Integer courseId;
    @ApiModelProperty("章节ID")
    private Integer sectionId;
    @ApiModelProperty("课时主题")
    private String theme;
    private String duration;

    @ApiModelProperty("课时是否可播放")
    private boolean canPlay=false;

    //视频媒体信息
    @ApiModelProperty("视频媒体信息")
    private CourseMediaRespVo videoMediaDTO;
    @ApiModelProperty("文本内容")
    private String textContent;
    //课时状态
    @ApiModelProperty("课时状态:UNRELEASE-待更新,RELEASE-已发布")
    private Integer status;

    @ApiModelProperty("是否有视频 v1.2")
    private boolean hasVideo = false;

    @ApiModelProperty("是否学习过 v1.2")
    private boolean hasLearned = false;

    @ApiModelProperty("文稿页URL v1.2")
    private String textUrl;

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

    public boolean isCanPlay() {
        return canPlay;
    }

    public void setCanPlay(boolean canPlay) {
        this.canPlay = canPlay;
    }

    public CourseMediaRespVo getVideoMediaDTO() {
        return videoMediaDTO;
    }

    public void setVideoMediaDTO(CourseMediaRespVo videoMediaDTO) {
        this.videoMediaDTO = videoMediaDTO;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean isHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public boolean isHasLearned() {
        return hasLearned;
    }

    public void setHasLearned(boolean hasLearned) {
        this.hasLearned = hasLearned;
    }

    public String getTextUrl() {
        return textUrl;
    }

    public void setTextUrl(String textUrl) {
        this.textUrl = textUrl;
    }
}
