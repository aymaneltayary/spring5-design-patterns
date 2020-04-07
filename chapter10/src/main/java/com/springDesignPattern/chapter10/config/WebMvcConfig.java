/**
 * 
 */
package com.springDesignPattern.chapter10.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author aeltayary
 *
 */
@Configuration
@ComponentScan("com.springDesignPattern.chapter10")
@EnableWebMvc
public class WebMvcConfig {

	/**
	 * 
	 */
	public WebMvcConfig() {
		// TODO Auto-generated constructor stub
	}

}
