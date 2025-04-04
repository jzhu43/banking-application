package com.cbdg.interview.model;

import java.math.BigDecimal;
import java.util.Date;

//Class that defines the transaction and its attributes
public class Transaction {
    private BigDecimal amount;
    private String description;
    private Date date;

    public Transaction(BigDecimal amt, String desc, Date date){
        this.amount = amt;
        this.description = desc;
        this.date = date;
    }
}
