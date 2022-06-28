package com.jpa.id.jpaIdClass.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Objects;

@Entity
@IdClass(AccountId.class)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Account {
    @Id
    private String accountNumber;
    @Id
    private String accountType;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Account account = (Account) o;
        return accountNumber != null && Objects.equals(accountNumber, account.accountNumber)
                && accountType != null && Objects.equals(accountType, account.accountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountType);
    }
}