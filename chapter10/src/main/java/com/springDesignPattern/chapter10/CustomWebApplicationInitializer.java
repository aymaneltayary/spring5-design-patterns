package com.springDesignPattern.chapter10;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.springDesignPattern.chapter10.config.ApplicationConfig;
import com.springDesignPattern.chapter10.config.WebMvcConfig;

public class CustomWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	public CustomWebApplicationInitializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {ApplicationConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {WebMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
