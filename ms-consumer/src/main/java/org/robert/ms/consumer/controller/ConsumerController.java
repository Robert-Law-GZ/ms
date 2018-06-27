package org.robert.ms.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.robert.ms.consumer.model.BankInfo;
import org.robert.ms.consumer.model.User;
import org.robert.ms.consumer.service.AccountFeignClient;
import org.robert.ms.consumer.service.FinanceFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController implements AccountFeignClient,FinanceFeignClient{
    private static final Logger log = LoggerFactory.getLogger(ConsumerController.class);

    @Autowired
    private AccountFeignClient accountFeignClient;
    @Autowired
    private FinanceFeignClient financeFeignClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @HystrixCommand(fallbackMethod = "findByIdFallback")
    @RequestMapping(value ="/user")
    public User userInfo(){
        return accountFeignClient.userInfo();
    }

    @RequestMapping(value ="/bank-info")
    public BankInfo bankInfo(){
        return financeFeignClient.bankInfo();
    }

    @GetMapping(value = "/get-instance")
    public void getInstance(){
        ServiceInstance accountInstance = loadBalancerClient.choose("account");
        log.info("实例host:"+accountInstance.getHost());
    }

    public User findByIdFallback(){
        User user=new User();
        user.setName("默认名");
        user.setUsername("default");
        return user;
    }

}
