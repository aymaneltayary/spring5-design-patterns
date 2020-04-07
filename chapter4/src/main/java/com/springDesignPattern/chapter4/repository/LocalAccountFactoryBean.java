/**
 * 
 */
package com.springDesignPattern.chapter4.repository;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author aeltayary
 *
 */
public class LocalAccountFactoryBean implements FactoryBean<AccountRepository> {

	private String implType;

	public String getType() {
		return implType;
	}

	public void setType(String implType) {
		this.implType = implType;
	}

	@Override
	public AccountRepository getObject() throws Exception {

		if (implType.equals("DUMMY"))
			return new DummyAccountRepositoryImpl();
		else
			return new AnotherDummyAccountRepositoryImpl();
	}

	@Override
	public Class<AccountRepository> getObjectType() {
		return AccountRepository.class;
	}

}
