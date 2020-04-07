/**
 * 
 */
package com.springDesignPattern.chapter4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springDesignPattern.chapter4.model.Account;
import com.springDesignPattern.chapter4.repository.AccountRepository;

/**
 * @author aeltayary
 *
 */
@Service
public class AccountService {

	//@Autowired
	//@Qualifier("AnotherDummyAccountRepositoryImpl")
	private AccountRepository accountRep;
	
	@Autowired
	private AccountRepository accountRepCopy;

	public AccountRepository getAccountRep() {
		return accountRep;
	}

	public void setAccountRep(AccountRepository accountRep) {
		this.accountRep = accountRep;
	}

	public List<Account> getAllAccounts() {

		return accountRep.findAllAccount();
	}

}
