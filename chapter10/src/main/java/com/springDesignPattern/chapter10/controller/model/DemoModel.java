/**
 * 
 */
package com.springDesignPattern.chapter10.controller.model;

/**
 * @author aeltayary
 *
 */
public class DemoModel {

	private int id=1;
	private String name="demo";
	public DemoModel(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
