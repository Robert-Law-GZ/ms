package org.robert.ms.consumer.service;

import org.robert.ms.consumer.model.BankInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "finance")
public interface FinanceFeignClient {
    @RequestMapping(value = "/finance/bankInfo")
    BankInfo bankInfo();
}
