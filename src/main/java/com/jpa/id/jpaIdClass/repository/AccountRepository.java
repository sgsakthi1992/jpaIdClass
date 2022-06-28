package com.jpa.id.jpaIdClass.repository;

import com.jpa.id.jpaIdClass.model.Account;
import com.jpa.id.jpaIdClass.model.AccountId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, AccountId> {
}
