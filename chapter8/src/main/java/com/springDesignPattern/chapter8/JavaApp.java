package com.springDesignPattern.chapter8;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springDesignPattern.chapter8.config.ApplicationConfig;
import com.springDesignPattern.chapter8.entity.Actor;
import com.springDesignPattern.chapter8.service.ActorService;


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
        List<Actor> list=null;
			list = accountService.getAllActors();
      Actor actor= accountService.getActor(30);
 		System.out.println(actor);
		list.stream().forEach(act ->System.out.println(act));
 		
    }
}
