package com.springDesignPattern.chapter7;

import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDesignPattern.chapter7.model.Actor;
import com.springDesignPattern.chapter7.service.ActorService;




public class XmlApp 
{
	
	public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        ActorService accountService=applicationContext.getBean("actorService",ActorService.class);
        List<Actor> list= accountService.getAllActors();
 		for (Actor actor:list) {
 			System.out.println(actor);
 		}
        
        Actor actor= accountService.getActor(30);
 		System.out.println(actor);
    }

    }

