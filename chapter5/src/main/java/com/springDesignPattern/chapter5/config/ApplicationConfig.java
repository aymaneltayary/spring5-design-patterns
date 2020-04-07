/**
 * 
 */
package com.springDesignPattern.chapter5.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springDesignPattern.chapter5.repository.AccountRepository;
import com.springDesignPattern.chapter5.repository.LocalAccountFactoryBean;
import com.springDesignPattern.chapter5.service.AccountService;

/**
 * @author aeltayary
 *
 */
@Configuration
@PropertySource("config.properties")
public class ApplicationConfig {

	@Bean
	public AccountService accountService(AccountRepository rep) {
		return new AccountService(rep);
		
	}

	@Bean
	public LocalAccountFactoryBean localAccountFactoryBean(@Value("${repository.impl.type}") String implType) {
	LocalAccountFactoryBean f= new LocalAccountFactoryBean();
	f.setImplType(implType);
	return f;
}

	@Bean
	public BeanPostProcessor customBeanPostProcessor() {
		return new CustomBeanPostProcessor();
		
	}
	


}
