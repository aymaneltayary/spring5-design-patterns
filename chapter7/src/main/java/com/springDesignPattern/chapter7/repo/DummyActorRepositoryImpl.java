/**
 * 
 */
package com.springDesignPattern.chapter7.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.springDesignPattern.chapter7.model.Actor;

/**
 * @author aeltayary
 *
 */
@Repository(value="DummyActorRepositoryImpl")
public class DummyActorRepositoryImpl implements ActorRepository {

	@Override
	public Actor findActorById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Actor> findAllActors() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
}
