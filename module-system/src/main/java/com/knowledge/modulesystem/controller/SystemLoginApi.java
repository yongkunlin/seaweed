package com.knowledge.modulesystem.controller;

import com.knowledge.corebase.api.AbstractController;
import com.knowledge.entitysystem.entity.SystemUser;
import com.knowledge.modulesystem.service.SystemUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(tags = "登陆管理")
@RestController
@RequestMapping("systemLogin")
public class SystemLoginApi extends AbstractController {

    @Autowired
    private SystemUserService systemUserService;

    @PostMapping("login")
    @ApiOperation(value = "登录")
    public Boolean login(@Valid @RequestBody SystemUser systemUser) {//  , @RequestParam String validataCode
        String sessionId = request.getSession().getId();
        boolean flag = systemUserService.login(systemUser);
        return flag;
    }
}
