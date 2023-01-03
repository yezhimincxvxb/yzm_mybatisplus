package com.yzm.plus04.service.impl;

import com.yzm.plus04.entity.User;
import com.yzm.plus04.mapper.UserMapper;
import com.yzm.plus04.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author Yzm
 * @since 2023/01/03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
