package com.springDesignPattern.chapter5;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDesignPattern.chapter5.model.Account;
import com.springDesignPattern.chapter5.service.AccountService;


public class XmlApp 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService=applicationContext.getBean("accountService",AccountService.class);
        List<Account> list= accountService.getAllAccounts();
        System.out.println("total number of account is "+list.size());
        
        
   
    
    }
}
