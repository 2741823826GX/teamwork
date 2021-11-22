package com.gaoxu.springboot.config;

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 实现登录拦截器
 * @author Gaoxu
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    /**
     * 设置登录拦截器
     * @param request
     * @param response
     * @param handler
     * @return true 放行，false 不放行
     * @throws Exception
     * */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录之后应该有用户的session，如果存在，说明用户已经登录，否则不能让其访问之后的界面
        //获取session，如果loginUser存在，则访问通过
        Object loginUser = request.getSession().getAttribute("loginUser");

        if (loginUser == null){
            //没有登录
            request.setAttribute("msg", "没有权限，请先登录");
            //返回登录页面
            request.getRequestDispatcher("").forward(request, response);
            return false;
        }else {
            //登录成功
            return true;
        }
    }


}
