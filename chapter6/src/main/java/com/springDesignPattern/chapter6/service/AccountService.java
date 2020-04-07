/**
 * 
 */
package com.springDesignPattern.chapter6.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springDesignPattern.chapter6.model.Account;
import com.springDesignPattern.chapter6.repo.AccountRepository;


/**
 * @author aeltayary
 *
 */
@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRep;

	public void setAccountRep(AccountRepository accountRep) {
		this.accountRep = accountRep;
	}

	public AccountService(AccountRepository accountRep) {
		super();
		this.accountRep = accountRep;
	}

	public AccountRepository getAccountRep() {
		return accountRep;
	}

	public List<Account> getAllAccounts() {

		return accountRep.findAllAccount();
	}
	
	
	public Account getAccount(Object id) throws Exception {

		return accountRep.findAccountById(id);
	}


}
