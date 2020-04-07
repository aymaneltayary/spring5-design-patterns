/**
 * 
 */
package com.springDesignPattern.chapter6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



/**
 * @author aeltayary
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.springDesignPattern.chapter6.service",
								"com.springDesignPattern.chapter6.repo", 
								"com.springDesignPattern.chapter6.aop"})
@EnableAspectJAutoProxy
public class ApplicationConfig {



}
