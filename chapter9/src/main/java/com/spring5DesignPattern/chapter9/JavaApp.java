package com.spring5DesignPattern.chapter9;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springDesignPattern.chapter9.config.ApplicationConfig;
import com.springDesignPattern.chapter9.entity.Actor;
import com.springDesignPattern.chapter9.service.ActorService;
import java.util.*;

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
        ActorService accountService=applicationContext.getBean("actorService",ActorService.class);
			//Actor actor1= accountService.getActor(30);
			
			// call the method again to test the cache
			//Actor actor2= accountService.getActor(30);
			
			
			List<Actor> result1=accountService.getAllActors(1000);
			List<Actor> result2=accountService.getAllActors(1000);
			
    }
}
