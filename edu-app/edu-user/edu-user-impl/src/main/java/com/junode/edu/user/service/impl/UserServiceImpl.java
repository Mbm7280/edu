package com.junode.edu.user.service.impl;

import com.junode.edu.user.entity.User;
import com.junode.edu.user.mapper.UserMapper;
import com.junode.edu.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
