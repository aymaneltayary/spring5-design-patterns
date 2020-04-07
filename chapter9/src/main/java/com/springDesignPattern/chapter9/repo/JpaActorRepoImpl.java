package com.springDesignPattern.chapter9.repo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.springDesignPattern.chapter9.entity.Actor;

@Repository
public class JpaActorRepoImpl implements ActorRepository {

	@PersistenceContext
	private EntityManager  entityManager;
	
	// or
	@Autowired
	private EntityManagerFactory emf;
	
	
	
	public EntityManager getEntityManager() {
		return entityManager;
	}


	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	
	@Override
	public Actor findActorById(Integer id) {
		return entityManager.find(Actor.class, id);
	
	}

	
	@Override
	public List<Actor> findAllActors(Integer lessThan) {
		TypedQuery<Actor> q= entityManager.createQuery("from Actor act where  act.actorId < :actorId", Actor.class);
		q.setParameter("actorId", lessThan);
		return  q.getResultList();
	
	
	}



	
}
