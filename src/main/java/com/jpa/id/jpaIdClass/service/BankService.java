package com.jpa.id.jpaIdClass.service;

import com.jpa.id.jpaIdClass.model.Bank;
import com.jpa.id.jpaIdClass.repository.BankRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    private final BankRepository bankRepository;

    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public List<Bank> getBanks() {
        return bankRepository.findAll();
    }

    public Bank createBank(Bank bank) {
        return bankRepository.save(bank);
    }
}
