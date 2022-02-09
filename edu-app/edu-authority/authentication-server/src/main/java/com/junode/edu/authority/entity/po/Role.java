package com.junode.edu.authority.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;

import java.util.Set;


//@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
@TableName("roles")
public class Role extends AuthorityBasePO {

    private String code;

    private String name;

    private String description;

    @TableField(exist = false)
    private Set<Integer> resourceIds;

    public Role() {
    }

    public Role(String code, String name, String description, Set<Integer> resourceIds) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.resourceIds = resourceIds;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Integer> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(Set<Integer> resourceIds) {
        this.resourceIds = resourceIds;
    }
}
