package com.yzm.plus01.service.impl;

import com.yzm.plus01.entity.Account;
import com.yzm.plus01.mapper.AccountMapper;
import com.yzm.plus01.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账号资金表 服务实现类
 * </p>
 *
 * @author Yzm
 * @since 2022/12/30
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
