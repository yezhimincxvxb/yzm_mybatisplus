package com.yzm.plus01.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yzm.plus01.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yzm.plus01.vo.UserVo;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author Yzm
 * @since 2022/12/30
 */
public interface IUserService extends IService<User> {

    IPage<UserVo> pageUser(IPage<?> page, boolean deleted);

    IPage<UserVo> pageUser2(IPage<UserVo> page, boolean deleted);

}
