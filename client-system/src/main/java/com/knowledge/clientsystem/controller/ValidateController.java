package com.knowledge.clientsystem.controller;

import com.google.code.kaptcha.Producer;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

@Controller
@RequestMapping("validata")
public class ValidateController {

    @Autowired
    @SuppressWarnings("all")
    private Producer producer;

    /**
     * 创建验证码
     *
     * @throws Exception
     */
    @GetMapping("code")
    @ApiOperation(value = "创建验证码")
    public void createCode(@RequestParam String deviceId, HttpServletResponse response) throws Exception {
        Assert.notNull(deviceId, "机器码不能为空");
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");
        //生成文字验证码
        String text = producer.createText();
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
//        validateCodeService.saveImageCode(deviceId, text);
        try (ServletOutputStream out = response.getOutputStream()) {
            ImageIO.write(image, "JPEG", out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
