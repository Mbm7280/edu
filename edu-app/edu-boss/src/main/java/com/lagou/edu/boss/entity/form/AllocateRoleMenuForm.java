package com.lagou.edu.boss.entity.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author : chenrg
 * @create 2020/7/13 15:08
 **/
@ApiModel("给角色分配菜单")
////@Data
@NoArgsConstructor
@ToString
public class AllocateRoleMenuForm implements Serializable {

    @ApiModelProperty("角色ID")
    private Integer roleId;

    @ApiModelProperty("分配的菜单ID列表")
    private List<Integer> menuIdList;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public List<Integer> getMenuIdList() {
        return menuIdList;
    }

    public void setMenuIdList(List<Integer> menuIdList) {
        this.menuIdList = menuIdList;
    }
}
