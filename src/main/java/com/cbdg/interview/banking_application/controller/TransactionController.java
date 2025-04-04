package com.cbdg.interview.banking_application.controller;

import org.springframework.web.bind.annotation.*;

import com.cbdg.interview.banking_application.model.Transaction;

import java.math.BigDecimal;
import java.util.*;
import java.time.LocalDate;
import java.time.Month;

//Transaction controller that has all the transaction related APIs


@RestController
@RequestMapping("/transactions")
public class TransactionController {

    List<Transaction> allTransactions = new ArrayList<>();
    
    public TransactionController(){
        //Add a couple more transactions for testing
        allTransactions.add(new Transaction(0, "Credit", new BigDecimal(15.00), "Payment for lunch", LocalDate.of(2025, 04, 01)));
        allTransactions.add(new Transaction(1, "Credit", new BigDecimal(20.00), "Payment for dinner", LocalDate.of(2025, 04, 02)));
    }
    

    //POST API call to createTransaction - takes in a request body
    @PostMapping
    public Integer createTransaction(@RequestBody Transaction transaction){
        allTransactions.add(transaction);
        return transaction.getId();
    }

    //GET API call to grab monthly statement based off of what month is given
    @GetMapping("/statements/{month}")
    public List<Transaction> getMonthlyStatements(@PathVariable String month){
        return allTransactions.stream().filter(transaction -> transaction.getDate().getMonth() == Month.valueOf(month)).toList();
    }
    
}
