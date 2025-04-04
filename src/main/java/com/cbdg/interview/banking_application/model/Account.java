package com.cbdg.interview.banking_application.model;
import java.math.BigDecimal;

//Class that defines an account and its attributes
public class Account {
    private Integer id;
    private String accountNumber;
    private String accountType;
    private BigDecimal balance;

    public Account(Integer id, String acctNumber, String acctType, BigDecimal bal){
        this.id = id;
        this.accountNumber = acctNumber;
        this.accountType = acctType;
        this.balance = bal;
    }

    public Integer getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    
}
