package com.springDesignPattern.chapter8.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springDesignPattern.chapter8.entity.Actor;

//@Repository
public class JdbcActorRepoImpl implements ActorRepository {

	@Autowired
	private JdbcTemplate  jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public Actor findActorById(Integer id) {
	return	jdbcTemplate.queryForObject("SELECT * FROM actor where actor_id=?", new RowMapper<Actor>(){  
		    @Override  
		    public Actor mapRow(ResultSet rs, int rownumber) throws SQLException {  
		    	Actor actor=new Actor();
		    	actor.setActorId(rs.getInt("actor_id"));  
		    	actor.setFirstName(rs.getString("first_name"));  
		    	actor.setLastName(rs.getString("last_name"));  
		    //	actor.setLastUpdate(rs.getDate("last_update"));  
		        return actor;  
		    }  
		    }, id);
	
	}

	
	@Override
	public List<Actor> findAllActors() {
		return  jdbcTemplate.query("SELECT * FROM actor where actor_id <?", new RowMapper<Actor>(){  
		    @Override  
		    public Actor mapRow(ResultSet rs,int rownNumber) throws SQLException {  
		    	Actor actor=new Actor();
		    	actor.setActorId(rs.getInt("actor_id"));  
		    	actor.setFirstName(rs.getString("first_name"));  
		    	actor.setLastName(rs.getString("last_name"));  
		    	//actor.setLastUpdatedDate(rs.getDate("last_update"));  
		        return actor;  
		    }  
		    }, 10);

	
	
	}


	
	
}
