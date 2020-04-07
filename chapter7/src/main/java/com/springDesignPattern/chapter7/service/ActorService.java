/**
 * 
 */
package com.springDesignPattern.chapter7.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springDesignPattern.chapter7.model.Actor;
import com.springDesignPattern.chapter7.repo.ActorRepository;


/**
 * @author aeltayary
 *
 */
@Service
public class ActorService {

	@Autowired
	@Qualifier(value = "JdbcActorRepoImpl")
	private ActorRepository actorRepo;

	public List<Actor> getAllActors() {
		return actorRepo.findAllActors();
	}
	
	
	public ActorRepository getActorRepo() {
		return actorRepo;
	}


	public void setActorRepo(ActorRepository actorRepo) {
		this.actorRepo = actorRepo;
	}


	public Actor getActor(Integer id)  {
		return actorRepo.findActorById(id);
	}


}
