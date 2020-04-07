/**
 * 
 */
package com.springDesignPattern.chapter8.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;







/**
 * @author aeltayary
 *
 */
@Configuration
@PropertySource("config.properties")
@ComponentScan(basePackages = {"com.springDesignPattern.chapter8.service",
								"com.springDesignPattern.chapter8.repo", 
								"com.springDesignPattern.chapter8.config"})
public class ApplicationConfig {





}
