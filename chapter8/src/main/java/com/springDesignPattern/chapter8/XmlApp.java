package com.springDesignPattern.chapter8;

import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDesignPattern.chapter8.entity.Actor;
import com.springDesignPattern.chapter8.service.ActorService;



public class XmlApp 
{
	
	public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        ActorService accountService=applicationContext.getBean("actorService",ActorService.class);
        List<Actor> list= accountService.getAllActors();
        Actor actor= accountService.getActor(30);
 		System.out.println(actor);
		list.stream().forEach(act ->System.out.println(act));
    }

    }

