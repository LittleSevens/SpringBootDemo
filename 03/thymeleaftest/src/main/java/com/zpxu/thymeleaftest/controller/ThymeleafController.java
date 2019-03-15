package com.zpxu.thymeleaftest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ThymeleafController {
    @RequestMapping("regexptest")
    public String regexptest(HttpServletRequest request, HttpSession session){
        request.setAttribute("book","疯狂Spring Boot讲义");
        session.setAttribute("school","疯狂软件");
        request.getServletContext().setAttribute("name","Thymeleaf 模板引擎");
        return "success1";
    }
}
