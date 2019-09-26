package com.knowledge.corebase.api;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AbstractController implements InterfaceController {
    @Resource
    protected HttpServletRequest request;

    protected HttpServletResponse response;

    /**
     * 设置response
     *
     * @param response
     */
    // Spring MVC  在调用目标处理方法前，会先逐个调用在方法级上标注了 @ModelAttribute 的方法
    @ModelAttribute
    private final void initResponse(HttpServletResponse response) {
        this.response = response;
    }
}
