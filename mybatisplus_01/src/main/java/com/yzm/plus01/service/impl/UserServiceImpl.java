package com.yzm.plus01.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yzm.plus01.entity.User;
import com.yzm.plus01.mapper.UserMapper;
import com.yzm.plus01.service.IUserService;
import com.yzm.plus01.vo.UserVo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author Yzm
 * @since 2022/12/30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public IPage<UserVo> pageUser(IPage<?> page, boolean deleted) {
        return this.baseMapper.pageUser(page, deleted);
    }

    @Override
    public IPage<UserVo> pageUser2(IPage<UserVo> page, boolean deleted) {
        page.setRecords(this.baseMapper.pageUser2(page, deleted));
        return page;
    }
}
