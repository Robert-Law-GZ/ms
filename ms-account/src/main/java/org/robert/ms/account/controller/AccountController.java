package org.robert.ms.account.controller;

import org.robert.ms.account.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class AccountController {

    @RequestMapping(value = "/info",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public User userInfo(){
        User user=new User();
        return user;
    }

    @Value("${name}")
    private  String name="";
    @Value("${age}")
    private  String age="";
    @Value("${version}")
    private  String version="开发环境";

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "你好，我是"+name+",年龄："+age+"岁。当前环境："+version;
    }

}
