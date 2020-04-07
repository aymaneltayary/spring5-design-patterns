/**
 * 
 */
package com.springDesignPattern.chapter4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springDesignPattern.chapter4.model.Account;

/**
 * @author aeltayary
 *
 */
//@Repository(value="DummyAccountRepositoryImpl")
public class DummyAccountRepositoryImpl implements AccountRepository{

	@Override
	public Account findAccountById() {
		return new Account(1, "accountName");
	}

	@Override
	public List<Account> findAllAccount() {
		Account a;
		List accountList= new ArrayList<>();
		accountList.add(new Account(1, "accountName_1"));
		accountList.add(new Account(2, "accountName_2"));
		accountList.add(new Account(3, "accountName_3"));
		accountList.add(new Account(4, "accountName_4"));
		accountList.add(new Account(5, "accountName_5"));
		return accountList;
		
	}

	

}
