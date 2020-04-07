package com.springDesignPattern.chapter5.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springDesignPattern.chapter5.model.Account;


public interface AccountRepository {

public Account findAccountById();
public List<Account> findAllAccount();


}
