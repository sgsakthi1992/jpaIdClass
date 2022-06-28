package com.jpa.id.jpaIdClass.repository;

import com.jpa.id.jpaIdClass.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
}
