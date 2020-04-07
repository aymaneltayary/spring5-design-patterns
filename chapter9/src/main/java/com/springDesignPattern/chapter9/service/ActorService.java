/**
 * 
 */
package com.springDesignPattern.chapter9.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.springDesignPattern.chapter9.entity.Actor;
import com.springDesignPattern.chapter9.repo.ActorRepository;


/**
 * @author aeltayary
 *
 */
@Service
public class ActorService {

	@Autowired
	private ActorRepository actorRepo;

	
	@Transactional
	@Cacheable("account-cache")
	public List<Actor> getAllActors(Integer lessThan) {
		return actorRepo.findAllActors(lessThan);
	} 

	@Transactional
	@Cacheable("account-cache")
	public Actor getActor(Integer id)  {
		return actorRepo.findActorById(id);
	}


}
