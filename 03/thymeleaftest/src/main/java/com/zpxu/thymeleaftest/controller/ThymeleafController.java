package com.zpxu.thymeleaftest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ThymeleafController {
    @RequestMapping("/regexptest")
    public String regexptest(HttpServletRequest request, HttpSession session){
        request.setAttribute("book","疯狂Spring Boot讲义");
        session.setAttribute("school","疯狂软件");
        request.getServletContext().setAttribute("name","Thymeleaf 模板引擎");
        return "success1";
    }

    @RequestMapping("/iftest")
    public String iftest(WebRequest webRequest){
        webRequest.setAttribute("username","zpxu", RequestAttributes.SCOPE_REQUEST);
        webRequest.setAttribute("age",21,RequestAttributes.SCOPE_REQUEST);
        webRequest.setAttribute("role","admin",RequestAttributes.SCOPE_REQUEST);
        return "success2";
    }
}
