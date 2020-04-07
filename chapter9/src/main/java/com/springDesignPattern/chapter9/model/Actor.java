package com.springDesignPattern.chapter9.model;

import java.util.Date;

public class Actor {

	
private Integer actorID;
private String firstName;
private String lastName;
public Integer getActorID() {
	return actorID;
}
public void setActorID(Integer actorID) {
	this.actorID = actorID;
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
@Override
public String toString() {
	return "Actor [actorID=" + actorID + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdatedDate="
			+ lastUpdatedDate + "]";
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getLastUpdatedDate() {
	return lastUpdatedDate;
}
public void setLastUpdatedDate(Date lastUpdatedDate) {
	this.lastUpdatedDate = lastUpdatedDate;
}
private Date lastUpdatedDate;



}
