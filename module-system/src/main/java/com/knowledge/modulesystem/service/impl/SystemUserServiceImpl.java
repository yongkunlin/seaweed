package com.knowledge.modulesystem.service.impl;

import com.knowledge.corebase.util.common.MD5Util;
import com.knowledge.entitysystem.entity.SystemUser;
import com.knowledge.modulesystem.mapper.SystemUserMapper;
import com.knowledge.modulesystem.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.validation.Valid;

@Service
public class SystemUserServiceImpl implements SystemUserService {

    @Autowired
    private SystemUserMapper systemUserMapper;

    @Override
    public Boolean login(@Valid SystemUser systemUser) {
        SystemUser user = getSystemUserByAccount(systemUser.getAccount());
        if (user == null) {
            return false;
        }
        return MD5Util.get32MD5ByStr(systemUser.getPassword()).equals(user.getPassword());
    }

    @Override
    public SystemUser getSystemUserByAccount(String account) {
//        if (StringUtils.isEmpty(account)) {
//            return null;
//        }
        return systemUserMapper.getSystemUserByAccount(account);
    }
}
