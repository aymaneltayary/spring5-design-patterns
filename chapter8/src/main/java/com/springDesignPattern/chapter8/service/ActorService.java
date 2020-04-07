/**
 * 
 */
package com.springDesignPattern.chapter8.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springDesignPattern.chapter8.entity.Actor;
import com.springDesignPattern.chapter8.repo.ActorRepository;


/**
 * @author aeltayary
 *
 */
@Service
public class ActorService {

	@Autowired
	private ActorRepository actorRepo;

	@Transactional
	public List<Actor> getAllActors() {
		return actorRepo.findAllActors();
	}
	@Transactional
	public Actor getActor(Integer id)  {
		return actorRepo.findActorById(id);
	}


}
