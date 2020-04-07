package com.springDesignPattern.chapter9.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springDesignPattern.chapter9.entity.Actor;



public interface ActorRepository {

public Actor findActorById(Integer id) ;
public List<Actor> findAllActors(Integer lessThan);


}
