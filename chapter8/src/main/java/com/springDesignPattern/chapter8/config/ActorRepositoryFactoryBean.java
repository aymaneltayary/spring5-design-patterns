package com.springDesignPattern.chapter8.config;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springDesignPattern.chapter8.repo.ActorRepository;
import com.springDesignPattern.chapter8.repo.JdbcActorRepoImpl;
import com.springDesignPattern.chapter8.repo.JpaActorRepoImpl;

//@Component
public class ActorRepositoryFactoryBean implements FactoryBean<ActorRepository> {

	@Value("${repo.type}")
	private String impl;

	@PersistenceContext
	private EntityManager  entityManager;
	
	@Autowired
	private JdbcTemplate  jdbcTemplate;
	
	
	@Override
	public ActorRepository getObject() throws Exception {
		if ("JPA".equals(impl)) {
			JpaActorRepoImpl var= new JpaActorRepoImpl();
			var.setEntityManager(entityManager);
			return var;
		}else {
			JdbcActorRepoImpl var= new JdbcActorRepoImpl();
			var.setJdbcTemplate(jdbcTemplate);
			return var;
		}
	}

	public String getImpl() {
		return impl;
	}

	public void setImpl(String impl) {
		this.impl = impl;
	}

	@Override
	public Class<?> getObjectType() {
		return ActorRepository.class;
	}

}
