package org.robert.ms.account.controller;

import org.robert.ms.account.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")

public class AccountController {

    @RequestMapping(value = "/info")
    public User userInfo(){
        User user=new User();
        return user;
    }

}
