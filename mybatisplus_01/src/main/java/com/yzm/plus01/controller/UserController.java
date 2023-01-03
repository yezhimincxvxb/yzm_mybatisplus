package com.yzm.plus01.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yzm.plus01.entity.User;
import com.yzm.plus01.service.IUserService;
import com.yzm.plus01.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author Yzm
 * @since 2022/12/30
 */
@RestController
@RequestMapping("/plus01/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/page")
    public IPage<User> page() {
        // current = 0或1都一样
        return userService.page(new Page<>(0, 2));
    }

    /**
     * 下拉分页，只执行一次sql，不返回总记录数、总页数
     * @return
     */
    @GetMapping("/page2")
    public IPage<User> page2() {
        return userService.page(new Page<>(1, 2, false));
    }

    @GetMapping("/pageUser")
    public IPage<UserVo> pageUser() {
        return userService.pageUser(new Page<>(1, 2), false);
    }

    @GetMapping("/pageUser2")
    public IPage<UserVo> pageUser2() {
        return userService.pageUser2(new Page<>(2, 2), false);
    }

    @GetMapping("/list")
    public List<User> list() {
        return userService.list(new LambdaQueryWrapper<User>().gt(User::getId, 2));
    }

    @GetMapping("/list2")
    public List<User> list2() {
        return userService.list(new QueryWrapper<>(User.builder().gender("1").state(true).build()));
    }

    @GetMapping("/list3")
    public List<User> list3() {
        return userService.list(Wrappers.<User>lambdaQuery().in(User::getId, 3, 4, 5));
    }

    @GetMapping("/list4")
    public List<User> list4() {
        return userService.query().gt("id", 3).list();
    }

    @GetMapping("/list5")
    public List<User> list5() {
        return userService.lambdaQuery().gt(User::getId,2).orderByDesc(User::getCreateDate).list();
    }

}
