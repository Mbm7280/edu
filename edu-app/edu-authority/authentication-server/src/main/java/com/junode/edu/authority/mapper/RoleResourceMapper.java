package com.junode.edu.authority.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.junode.edu.authority.entity.po.RoleResource;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RoleResourceMapper extends BaseMapper<RoleResource> {
}