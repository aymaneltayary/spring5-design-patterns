/**
 * 
 */
package com.springDesignPattern.chapter6.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author aeltayary
 *
 */
@Component
@Aspect
public class LoggingAspect {

	private static Logger log = LoggerFactory.getLogger(LoggingAspect.class);

	
	@Before("execution(* com.springDesignPattern.chapter6.repo.AccountRepositoryImpl.findAllAccount(..))")
	public void logBefore() {
		log.info("method {} has been started");
	}

	@After("execution(* com.springDesignPattern.chapter6.repo.AccountRepositoryImpl.findAllAccount(..))")
	public void logAfter() {
		log.info("method {} has been ended");
	}
	
	
	@AfterThrowing("execution(* com.springDesignPattern.chapter6.repo.AccountRepositoryImpl.findAccountById(..))")
	public void logAfterThrowing() {
		log.error("Exception has been occured ");
	}




	@Around("execution(* com.springDesignPattern.chapter6.repo.AccountRepositoryImpl.findAccountById(..))")
	public void logAround(ProceedingJoinPoint point) throws Throwable {
		Object id =point.getArgs()[0];
		if (id!=null) {
			log.error("id is not null ");
			point.proceed();
			log.error("Done");
		}
	}





}
