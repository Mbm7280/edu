package com.lagou.edu.auth.client.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 菜单
 *
 * @author : chenrg
 * @create 2020/7/8 16:54
 **/
@ApiModel("菜单信息")
//@Data
//@NoArgsConstructor
@ToString
public class MenuDTO extends AuthorityBaseDTO implements Comparable<MenuDTO> {

    public MenuDTO() {
    }

    /**
     * 父菜单ID
     */
    @ApiModelProperty("父级菜单ID")
    private Integer parentId;
    /**
     * 菜单名称
     */
    @ApiModelProperty("菜单名称")
    private String name;

    /**
     * 路径
     */
    @ApiModelProperty("路径")
    private String href;

    /**
     * 图标
     */
    @ApiModelProperty("图标")
    private String icon;

    /**
     * 排序
     */
    @ApiModelProperty("排序")
    private int orderNum;

    /**
     * 描述
     */
    @ApiModelProperty("描述")
    private String description;

    /**
     * 是否展示
     */
    @ApiModelProperty("是否显示")
    private boolean shown;

    /**
     * 菜单层级，从0开始，0为一级，依次类推
     */
    @ApiModelProperty("菜单层级")
    private int level;

    /**
     * 按orderNum排序，顺序数字越大排序越后
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(MenuDTO o) {
        return this.getOrderNum() - o.getOrderNum();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isShown() {
        return shown;
    }

    public void setShown(boolean shown) {
        this.shown = shown;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
