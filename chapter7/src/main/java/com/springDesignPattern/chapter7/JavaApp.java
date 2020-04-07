package com.springDesignPattern.chapter7;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springDesignPattern.chapter7.config.ApplicationConfig;
import com.springDesignPattern.chapter7.model.Actor;
import com.springDesignPattern.chapter7.service.ActorService;


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
        List<Actor> list= accountService.getAllActors();
        Actor actor= accountService.getActor(30);
 		System.out.println(actor);
		
    }
}
