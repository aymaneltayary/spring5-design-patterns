package com.springDesignPattern.chapter7.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springDesignPattern.chapter7.model.Actor;



public interface ActorRepository {

public Actor findActorById(Integer id) ;
public List<Actor> findAllActors();


}
