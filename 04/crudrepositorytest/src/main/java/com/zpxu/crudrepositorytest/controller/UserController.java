package com.zpxu.crudrepositorytest.controller;

import com.zpxu.crudrepositorytest.bean.User;
import com.zpxu.crudrepositorytest.service.UserService;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("save")
    public String save(){
        User user = new User();
        user.setLoginname("xuzhaopeng");
        user.setUsername("徐朝鹏");
        user.setSex('男');
        user.setAge(18);
        userService.save(user);
        return "保存数据成功";
    }

    @RequestMapping("update")
    public String update(){
        User user=userService.getById(1);
        userService.update(user);
        return "修改成功";
    }

    @RequestMapping("delete")
    public String delete(){
        userService.delete(1);
        return "删除数据成功";
    }

    @RequestMapping("getAll")
    public Iterable<User> getAll(){
        return userService.getAll();
    }
}
