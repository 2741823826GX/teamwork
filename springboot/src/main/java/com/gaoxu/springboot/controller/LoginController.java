package com.gaoxu.springboot.controller;

import com.gaoxu.springboot.pojo.User;
import com.gaoxu.springboot.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 登录控制器
 * @author GAOXU
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;
    /**
     * 系统登陆功能, 根据前端传入的name，password实现登录功能
     * @param name 登录时输入的用户名
     * @param password 登陆时输入的密码
     * @param request 使用session保存用户登录的账号密码
     * @return 跳转到其他页面
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String name, @RequestParam String password, HttpServletRequest request){
        //具体的业务
        User user = userService.findUserByUsername(name, password);
        if (user != null){
            request.getSession().setAttribute("loginUser", user);
            return "登录成功";
        }else {
            return "登录失败";
        }
    }
}
