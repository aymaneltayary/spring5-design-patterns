package com.springDesignPattern.chapter4;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDesignPattern.chapter4.config.ApplicationConfig;
import com.springDesignPattern.chapter4.model.Account;
import com.springDesignPattern.chapter4.service.AccountService;

/**
 * Hello world!
 *
 */
public class XmlApp 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService=applicationContext.getBean("accountService",AccountService.class);
        List<Account> list= accountService.getAllAccounts();
        System.out.println("total number of account is "+list.size());
        
        /*
        applicationContext= new ClassPathXmlApplicationContext("applicationContextScan.xml");
        accountService=applicationContext.getBean("accountService",AccountService.class);
        list= accountService.getAllAccounts();
        System.out.println("total number of account using annotation is "+list.size());
    */
    }
}
