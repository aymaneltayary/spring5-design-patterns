package com.spring5DesignPattern.chapter9;

import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDesignPattern.chapter9.entity.Actor;
import com.springDesignPattern.chapter9.service.ActorService;



public class XmlApp 
{
	
	public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        ActorService accountService=applicationContext.getBean("actorService",ActorService.class);
        List<Actor> list= accountService.getAllActors(1000);
        Actor actor= accountService.getActor(30);
 		System.out.println(actor);
		list.stream().forEach(act ->System.out.println(act));
    }

    }

