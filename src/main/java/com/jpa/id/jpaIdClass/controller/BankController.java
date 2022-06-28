package com.jpa.id.jpaIdClass.controller;

import com.jpa.id.jpaIdClass.model.Bank;
import com.jpa.id.jpaIdClass.service.BankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bank")
public class BankController {
    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping
    public List<Bank> getBanks() {
        return bankService.getBanks();
    }

    @PostMapping
    public Bank createBank(@RequestBody Bank bank) {
        return bankService.createBank(bank);
    }
}
