package com.zpxu.jsontest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/getjson")
    public String getjson() {
        return "getjson";
    }
}
