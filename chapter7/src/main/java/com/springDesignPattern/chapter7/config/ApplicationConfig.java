/**
 * 
 */
package com.springDesignPattern.chapter7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



/**
 * @author aeltayary
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.springDesignPattern.chapter7.service",
								"com.springDesignPattern.chapter7.repo", 
								"com.springDesignPattern.chapter7.config"})
public class ApplicationConfig {



}
