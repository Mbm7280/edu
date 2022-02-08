package com.lagou.edu.course.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author leo
 * @since 2020-06-11
 */
////@Data
@EqualsAndHashCode(callSuper = false)
public class CourseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 课程名
     */
    private String courseName;

    /**
     * 课程一句话简介
     */
    private String brief;

    /**
     * 课程描述
     */
    private String courseDescription;

    /**
     * 讲师id
     */
    private Integer teacherId;

    /**
     * 课时数
     */
    private Integer totalCourseTime;

    /**
     * 显示销量
     */
    private Integer sales;

    /**
     * 真实销量
     */
    private Integer actualSales;

    /**
     * 原价
     */
    private Double price;

    /**
     * 原价标签
     */
    private String priceTag;

    /**
     * 优惠价
     */
    private Double discounts;

    /**
     * 优惠标签
     */
    private String discountsTag;



    /**
     * 课程分享图片url
     */
    private String courseImgUrl;
    /**
     * 分享title
     */
    private String shareTitle;

    /**
     * 分享描述
     */
    private String shareDescription;

    /**
     * 分享图title
     */
    private String shareImageTitle;

    /**
     * 是否新品
     */
    private Boolean isNew;

    /**
     * 广告语
     */
    private String isNewDes;

    /**
     * 最后操作者
     */
    private Integer lastOperatorId;

    /**
     * 记录创建时间
     */
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    /**
     * 自动上架时间
     */
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime autoOnlineTime;

    /**
     * 是否删除
     */
    private Boolean isDel;

    /**
     * 总时长(分钟)
     */
    private Integer totalDuration;

    /**
     * seo描述
     */
    private String seoDescription;

    /**
     * seo关键词
     */
    private String seoKeywords;

    /**
     * html的title
     */
    private String seoTitle;



    /**
     * h5课程跳转页面（需产品定URL）
     */
    private String h5Url;

    /**
     * 课程列表展示图片
     */
    private String courseListImg;

    /**
     * APP端开悟言职列表的课程标记
     */
    private String tag;

    /**
     * 课程状态，0-草稿，1-上架
     */
    private Integer status;

    /**
     * 课程排序，用于后台保存草稿时用到
     */
    private Integer sortNum;

    /**
     * 佣金比例
     */
    private Integer brokerageRate;

    /**
     * 是否参与分销
     */
    private Boolean joinDistribution;

    /**
     * 最后课程最近通知时间
     */
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastNoticeTime;

    /**
     * 课程预览第一个字段
     */
    private String previewFirstField;

    /**
     * 课程预览第二个字段
     */
    private String previewSecondField;

    /**
     * 分销海报图片URL
     */
    private String distributionPosterImage;

    /**
     * 分销文案l列表
     */
    private String distributionCopywriter;

    /**
     * 是否是灰度课程
     */
    private Boolean isGray;

    /**
     * 课程中关模块
     */
    private List<SectionDTO> sectionDTOS;


    /**
     * 讲师
     */
    private TeacherDTO teacherDTO;


    /**
     * 播放地址
     */
    private String courseUrl;
    /**
     *课时列表
     */
     private List<LessonDTO> topNCourseLesson;
    /**
     * 是否购买
     */
    private Boolean isBuy = false;

    /**
     * 课程更新数量
     */
    private Integer lessonUpdateCount;
    /**
     * 待比较时间  最近播放时间
     */
    private Date compareTime;
    /**
     * 最后学习的课时名称
     */
    private String lastLearnLessonName;
    /**
     * 课程描述的markdown
     */
    private String courseDescriptionMarkDown;
    
    /**
     * 课程是否做秒杀活动 true是 false不是
     */
    private Boolean activityCourse = false;
    /**
     * 倒计时 课程活动倒计时 单位毫秒
     */
    private Long activityTime;
    
    /**
     * 活动课程信息
     */
    private ActivityCourseDTO activityCourseDTO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getTotalCourseTime() {
        return totalCourseTime;
    }

    public void setTotalCourseTime(Integer totalCourseTime) {
        this.totalCourseTime = totalCourseTime;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getActualSales() {
        return actualSales;
    }

    public void setActualSales(Integer actualSales) {
        this.actualSales = actualSales;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPriceTag() {
        return priceTag;
    }

    public void setPriceTag(String priceTag) {
        this.priceTag = priceTag;
    }

    public Double getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Double discounts) {
        this.discounts = discounts;
    }

    public String getDiscountsTag() {
        return discountsTag;
    }

    public void setDiscountsTag(String discountsTag) {
        this.discountsTag = discountsTag;
    }

    public String getCourseImgUrl() {
        return courseImgUrl;
    }

    public void setCourseImgUrl(String courseImgUrl) {
        this.courseImgUrl = courseImgUrl;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getShareDescription() {
        return shareDescription;
    }

    public void setShareDescription(String shareDescription) {
        this.shareDescription = shareDescription;
    }

    public String getShareImageTitle() {
        return shareImageTitle;
    }

    public void setShareImageTitle(String shareImageTitle) {
        this.shareImageTitle = shareImageTitle;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public String getIsNewDes() {
        return isNewDes;
    }

    public void setIsNewDes(String isNewDes) {
        this.isNewDes = isNewDes;
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

    public LocalDateTime getAutoOnlineTime() {
        return autoOnlineTime;
    }

    public void setAutoOnlineTime(LocalDateTime autoOnlineTime) {
        this.autoOnlineTime = autoOnlineTime;
    }

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean del) {
        isDel = del;
    }

    public Integer getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(Integer totalDuration) {
        this.totalDuration = totalDuration;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public String getH5Url() {
        return h5Url;
    }

    public void setH5Url(String h5Url) {
        this.h5Url = h5Url;
    }

    public String getCourseListImg() {
        return courseListImg;
    }

    public void setCourseListImg(String courseListImg) {
        this.courseListImg = courseListImg;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Integer getBrokerageRate() {
        return brokerageRate;
    }

    public void setBrokerageRate(Integer brokerageRate) {
        this.brokerageRate = brokerageRate;
    }

    public Boolean getJoinDistribution() {
        return joinDistribution;
    }

    public void setJoinDistribution(Boolean joinDistribution) {
        this.joinDistribution = joinDistribution;
    }

    public LocalDateTime getLastNoticeTime() {
        return lastNoticeTime;
    }

    public void setLastNoticeTime(LocalDateTime lastNoticeTime) {
        this.lastNoticeTime = lastNoticeTime;
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

    public String getDistributionPosterImage() {
        return distributionPosterImage;
    }

    public void setDistributionPosterImage(String distributionPosterImage) {
        this.distributionPosterImage = distributionPosterImage;
    }

    public String getDistributionCopywriter() {
        return distributionCopywriter;
    }

    public void setDistributionCopywriter(String distributionCopywriter) {
        this.distributionCopywriter = distributionCopywriter;
    }

    public Boolean getGray() {
        return isGray;
    }

    public void setGray(Boolean gray) {
        isGray = gray;
    }

    public List<SectionDTO> getSectionDTOS() {
        return sectionDTOS;
    }

    public void setSectionDTOS(List<SectionDTO> sectionDTOS) {
        this.sectionDTOS = sectionDTOS;
    }

    public TeacherDTO getTeacherDTO() {
        return teacherDTO;
    }

    public void setTeacherDTO(TeacherDTO teacherDTO) {
        this.teacherDTO = teacherDTO;
    }

    public String getCourseUrl() {
        return courseUrl;
    }

    public void setCourseUrl(String courseUrl) {
        this.courseUrl = courseUrl;
    }

    public List<LessonDTO> getTopNCourseLesson() {
        return topNCourseLesson;
    }

    public void setTopNCourseLesson(List<LessonDTO> topNCourseLesson) {
        this.topNCourseLesson = topNCourseLesson;
    }

    public Boolean getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(Boolean buy) {
        isBuy = buy;
    }

    public Integer getLessonUpdateCount() {
        return lessonUpdateCount;
    }

    public void setLessonUpdateCount(Integer lessonUpdateCount) {
        this.lessonUpdateCount = lessonUpdateCount;
    }

    public Date getCompareTime() {
        return compareTime;
    }

    public void setCompareTime(Date compareTime) {
        this.compareTime = compareTime;
    }

    public String getLastLearnLessonName() {
        return lastLearnLessonName;
    }

    public void setLastLearnLessonName(String lastLearnLessonName) {
        this.lastLearnLessonName = lastLearnLessonName;
    }

    public String getCourseDescriptionMarkDown() {
        return courseDescriptionMarkDown;
    }

    public void setCourseDescriptionMarkDown(String courseDescriptionMarkDown) {
        this.courseDescriptionMarkDown = courseDescriptionMarkDown;
    }

    public Boolean getActivityCourse() {
        return activityCourse;
    }

    public void setActivityCourse(Boolean activityCourse) {
        this.activityCourse = activityCourse;
    }

    public Long getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(Long activityTime) {
        this.activityTime = activityTime;
    }

    public ActivityCourseDTO getActivityCourseDTO() {
        return activityCourseDTO;
    }

    public void setActivityCourseDTO(ActivityCourseDTO activityCourseDTO) {
        this.activityCourseDTO = activityCourseDTO;
    }
}
