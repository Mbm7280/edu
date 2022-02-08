package com.lagou.edu.authority.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

//@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
@ToString
@TableName("menu")
public class Menu extends AuthorityBasePO {

    private Integer parentId;
    private String name;
    private String href;
    private String icon;
    private int orderNum;
    private String description;
    /**
     * 是否展示
     */
    private boolean shown;

    /**
     * 菜单层级，方便展示
     */
    private int level;

    public Menu() {
    }

    public Menu(Integer parentId, String name, String href, String icon, int orderNum, String description, boolean shown, int level) {
        this.parentId = parentId;
        this.name = name;
        this.href = href;
        this.icon = icon;
        this.orderNum = orderNum;
        this.description = description;
        this.shown = shown;
        this.level = level;
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
