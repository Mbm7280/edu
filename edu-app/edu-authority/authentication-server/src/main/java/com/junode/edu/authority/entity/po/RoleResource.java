package com.junode.edu.authority.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;

//@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
@TableName("role_resource_relation")
public class RoleResource extends AuthorityBasePO {

    private Integer roleId;

    private Integer resourceId;

    public RoleResource() {
    }

    public RoleResource(Integer roleId, Integer resourceId) {
        this.roleId = roleId;
        this.resourceId = resourceId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }
}
