package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: Roger
 * @Date: 2018/7/25 20:27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public Object getUser(){
        User u = new User();
        u.setName("imooc");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("imooc");
        return u;
    }

    @RequestMapping("/getUserJson")
    public Object getUserJson(){
        User u = new User();
        u.setName("imooc2");
        u.setAge(180);
        u.setBirthday(new Date());
        u.setPassword("imooc");
        return IMoocJSONResult.ok(u);
    }
}
