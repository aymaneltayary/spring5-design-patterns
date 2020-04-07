/**
 * 
 */
package com.springDesignPattern.chapter5.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springDesignPattern.chapter5.model.Account;
import com.springDesignPattern.chapter5.repository.AccountRepository;

/**
 * @author aeltayary
 *
 */
public class AccountService implements InitializingBean{

	
	private AccountRepository accountRep;

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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() initialization method");
		
	}


@PostConstruct
public void postConstructMethodExample() {
	System.out.println("postConstructMethodExample() initialization method");
	
	
}

}
