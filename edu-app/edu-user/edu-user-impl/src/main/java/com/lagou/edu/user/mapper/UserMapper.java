package com.lagou.edu.user.mapper;

import com.lagou.edu.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据Id查询客户信息
     * @param id
     * @return
     */
    User selectById(Integer id);

}
