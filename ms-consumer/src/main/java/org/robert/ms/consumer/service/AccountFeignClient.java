package org.robert.ms.consumer.service;

import org.robert.ms.consumer.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "account")
public interface AccountFeignClient {
    @RequestMapping(value = "/user/info", method = RequestMethod.GET)
    User userInfo();
}
