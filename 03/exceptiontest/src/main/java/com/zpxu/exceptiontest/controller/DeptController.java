package com.zpxu.exceptiontest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeptController {
    @RequestMapping("/add")
    public String add(String username)throws Exception{
        System.out.println("add()......");
        if (username==null){
            throw new NullPointerException("部门名称不能为空");
        }
        return "success";
    }
}
