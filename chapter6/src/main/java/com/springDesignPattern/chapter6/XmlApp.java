package com.springDesignPattern.chapter6;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDesignPattern.chapter6.model.Account;
import com.springDesignPattern.chapter6.service.AccountService;




public class XmlApp 
{
	
	public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService=applicationContext.getBean("accountService",AccountService.class);
        List<Account> list= accountService.getAllAccounts();
        try {
			Account acc= accountService.getAccount(new Object());
		} catch (Exception e) {
			
		}
    
    }

    }

