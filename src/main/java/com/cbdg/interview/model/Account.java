package com.cbdg.interview.model;

import java.math.BigDecimal;

//Class that defines an account and its attributes
public class Account {
    private String accountNumber;
    private String accountType;
    private BigDecimal balance;

    public Account(String acctNumber, String acctType, BigDecimal bal){
        this.accountNumber = acctNumber;
        this.accountType = acctType;
        this.balance = bal;
    }
}
