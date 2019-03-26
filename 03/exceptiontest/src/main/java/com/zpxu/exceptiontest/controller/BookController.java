package com.zpxu.exceptiontest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController extends BaseController{
    @RequestMapping("/find")
    public String find(){
        System.out.println("find().....");
        int i=5/0;
        return "success";
    }
}
