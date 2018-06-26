package org.robert.ms.finance.controller;

import org.robert.ms.finance.model.BankInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bank")
public class FinanceController {

    @RequestMapping(value = "/info")
    private BankInfo bankInfo() {
        return new BankInfo();
    }

}
