package com.junode.edu.oauth.service.impl;

import com.junode.edu.oauth.entity.Role;
import com.junode.edu.oauth.provider.OrganizationProvider;
import com.junode.edu.oauth.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

@Service
public class RoleService implements IRoleService {

    @Resource
    private OrganizationProvider organizationProvider;

    @Override
    public Set<Role> queryUserRolesByUserId(String userId) {
        return organizationProvider.queryRolesByUserId(userId).getData();
    }

}
