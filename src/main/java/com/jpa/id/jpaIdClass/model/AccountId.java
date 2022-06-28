package com.jpa.id.jpaIdClass.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountId implements Serializable {
    private String accountNumber;
    private String accountType;
}