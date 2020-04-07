/**
 * 
 */
package com.springDesignPattern.chapter4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springDesignPattern.chapter4.repository.AccountRepository;
import com.springDesignPattern.chapter4.repository.DummyAccountRepositoryImpl;
import com.springDesignPattern.chapter4.repository.LocalAccountFactoryBean;
import com.springDesignPattern.chapter4.service.AccountService;

/**
 * @author aeltayary
 *
 */
@Configuration
//@ComponentScan(basePackages = {"com.springDesignPattern.chapter4.service","com.springDesignPattern.chapter4.repository"})
public class ApplicationConfig {

@Bean
public AccountService accountService(AccountRepository acc) throws Exception {
	AccountService serv= new AccountService();
	serv.setAccountRep(acc);
	return serv;
}


@Bean
public LocalAccountFactoryBean accountRepository() {
	LocalAccountFactoryBean localAccountFactoryBean = new LocalAccountFactoryBean();
	localAccountFactoryBean.setType("DUMMY");
	return localAccountFactoryBean;
}


}
