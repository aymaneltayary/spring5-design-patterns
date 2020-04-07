package com.springDesignPattern.chapter4.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springDesignPattern.chapter4.model.Account;


public interface AccountRepository {

public Account findAccountById();
public List<Account> findAllAccount();


}
