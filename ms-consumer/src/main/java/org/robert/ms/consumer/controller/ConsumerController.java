package org.robert.ms.consumer.controller;

import org.robert.ms.consumer.model.BankInfo;
import org.robert.ms.consumer.model.User;
import org.robert.ms.consumer.service.AccountFeignClient;
import org.robert.ms.consumer.service.FinanceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController implements AccountFeignClient,FinanceFeignClient{
    @Autowired
    private AccountFeignClient accountFeignClient;
    @Autowired
    private FinanceFeignClient financeFeignClient;

    @RequestMapping(value ="/info")
    public User userInfo(){
        return accountFeignClient.userInfo();
    }

    @RequestMapping(value ="/bank_info")
    public BankInfo bankInfo(){
        return financeFeignClient.bankInfo();
    }

}
