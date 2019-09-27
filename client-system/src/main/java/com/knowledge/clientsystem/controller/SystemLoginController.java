package com.knowledge.clientsystem.controller;

import com.knowledge.clientsystem.client.SystemUserClient;
import com.knowledge.corebase.api.AbstractController;
import com.knowledge.entitysystem.entity.SystemUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Api(tags = "登陆管理")
@RestController
@RequestMapping("systemLogin")
public class SystemLoginController extends AbstractController {

    @Autowired
    @SuppressWarnings("all")
    private SystemUserClient systemUserClient;

    @RequestMapping("login")
    @ApiOperation(value = "登录")
    public Boolean login(@Valid SystemUser systemUser) {//  , @RequestParam String validataCode
        String sessionId = request.getSession().getId();
        boolean flag = systemUserClient.login(systemUser);
        return flag;
    }

}
