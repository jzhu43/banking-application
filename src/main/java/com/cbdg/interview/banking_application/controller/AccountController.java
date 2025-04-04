package com.cbdg.interview.banking_application.controller;
import java.math.BigDecimal;
import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.cbdg.interview.banking_application.model.Account;

//Account controller that has all account related APIs

@RestController
@RequestMapping("/accounts")
public class AccountController{
    private List<Account> mockAccounts = new ArrayList<>();

    public AccountController() {
        // Initialize mock accounts for Task 1
        mockAccounts.add(new Account(1, "12345", "Checking", new BigDecimal(100.00)));
        mockAccounts.add(new Account(2, "23456", "Savings", new BigDecimal(200.00)));
        mockAccounts.add(new Account(3, "34567", "Checking", new BigDecimal(300.00)));
        mockAccounts.add(new Account(4, "45678", "Savings", new BigDecimal(400.00)));
    }

    //GET API call to get list of accounts
    @GetMapping
    public List<Account> getAccounts(){
        return mockAccounts;
    }

    //GET API call to get a specific account based off of ID as a path variable
    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Integer id){
        return mockAccounts.stream().filter(account -> account.getId().equals(id)).findAny().orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Account is not found!"));
    }
}