package com.jpa.id.jpaIdClass.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Bank {
    @Id
    private Long id;
    private String name;
    @OneToMany(mappedBy = "bank")
    @ToString.Exclude
    private List<Account> accounts;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Bank bank = (Bank) o;
        return id != null && Objects.equals(id, bank.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
