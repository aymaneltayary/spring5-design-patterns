package com.springDesignPattern.chapter5.model;

public class Account {

	
private Integer id;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Account(Integer id, String accountName) {
	super();
	this.id = id;
	AccountName = accountName;
}
public String getAccountName() {
	return AccountName;
}
public void setAccountName(String accountName) {
	AccountName = accountName;
}

private String AccountName;



}
