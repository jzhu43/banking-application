package com.cbdg.interview.banking_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbdg.interview.banking_application.model.Transaction;

//Transaction repository for the interaction between transaction APIs and H2 database
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
