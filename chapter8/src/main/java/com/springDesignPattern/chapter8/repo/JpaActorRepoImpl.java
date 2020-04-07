package com.springDesignPattern.chapter8.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springDesignPattern.chapter8.entity.Actor;

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
	public List<Actor> findAllActors() {
		TypedQuery<Actor> q= entityManager.createQuery("from Actor act where  act.actorId < 10", Actor.class);
		return  q.getResultList();
	
	
	}



	
}
