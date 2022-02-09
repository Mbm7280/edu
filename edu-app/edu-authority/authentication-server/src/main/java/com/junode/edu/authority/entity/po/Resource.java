package com.junode.edu.authority.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.ToString;

//@Data
//@NoArgsConstructor
@ToString
@TableName("resource")
public class Resource extends AuthorityBasePO {
    /**
     * 资源名称
     */
    private String name;
    /**
     * 资源分类ID
     */
    private Integer categoryId;
    /**
     * 资源url，用于匹配访问路径。能匹配上表明有权限
     */
    private String url;
    /**
     * 资源描述
     */
    private String description;


    public Resource() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
