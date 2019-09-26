package com.knowledge.modulesystem.service;

import com.knowledge.entitysystem.entity.SystemUser;

import javax.validation.Valid;

public interface SystemUserService {

    /**
     * 用户登录
     *
     * @param systemUser
     * @return
     */
    Boolean login(@Valid SystemUser systemUser);

    /**
     * 根据账号查询用户
     *
     * @param account
     * @return
     */
    SystemUser getSystemUserByAccount(String account);

}
