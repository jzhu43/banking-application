package com.cbdg.interview.banking_application.model;

import java.math.BigDecimal;
import java.time.LocalDate;

//Class that defines the transaction and its attributes
public class Transaction {
    private Integer id;
    private BigDecimal amount;
    private String description;
    private LocalDate date;
    private String type;

    public Transaction(Integer id, String type, BigDecimal amt, String desc, LocalDate date){
        this.id = id;
        this.type = type;
        this.amount = amt;
        this.description = desc;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    
}
