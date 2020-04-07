package com.springDesignPattern.chapter5;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springDesignPattern.chapter5.config.ApplicationConfig;
import com.springDesignPattern.chapter5.model.Account;
import com.springDesignPattern.chapter5.service.AccountService;

/**
 * Hello world!
 *
 */
public class JavaApp 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ApplicationConfig.class);
        AccountService accountService=applicationContext.getBean("accountService",AccountService.class);
        List<Account> list= accountService.getAllAccounts();
        System.out.println("total number of account is "+list.size());
    
    }
}
