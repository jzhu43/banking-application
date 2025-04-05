package com.cbdg.interview.banking_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbdg.interview.banking_application.model.Account;

//Account repository for the interaction between account APIs and H2 database
public interface AccountRepository extends JpaRepository<Account, Long>{

}
