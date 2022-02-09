package com.junode.edu.authority.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;

//@Data
//@NoArgsConstructor
@TableName("role_menu_relation")
public class RoleMenu  extends AuthorityBasePO {

    private Integer menuId;

    private Integer roleId;

    public RoleMenu() {
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
