package com.springDesignPattern.chapter6.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springDesignPattern.chapter6.model.Account;



public interface AccountRepository {

public Account findAccountById(Object id) throws Exception;
public List<Account> findAllAccount();


}
