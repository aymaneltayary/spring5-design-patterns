/**
 * 
 */
package com.springDesignPattern.chapter6.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.springDesignPattern.chapter6.model.Account;

/**
 * @author aeltayary
 *
 */
@Repository
public class AccountRepositoryImpl implements AccountRepository {

	
	/**
	 * @throws Exception 
	 * 
	 */
	public List<Account> findAllAccount() {
		Account a;
		List accountList = new ArrayList<>();
		accountList.add(new Account(1, "accountName_1"));
		accountList.add(new Account(2, "accountName_2"));
		accountList.add(new Account(3, "accountName_3"));
		accountList.add(new Account(4, "accountName_4"));
		accountList.add(new Account(5, "accountName_5"));
		
		return accountList;

	}

	@Override
	public Account findAccountById(Object id) throws Exception {
		if (id==null) throw new Exception("Invalid account id");
		Account acc=new Account(1, "accountName_1");
		return acc;
	}

	
	
	
}
