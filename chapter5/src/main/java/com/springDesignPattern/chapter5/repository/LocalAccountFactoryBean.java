/**
 * 
 */
package com.springDesignPattern.chapter5.repository;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author aeltayary
 *
 */
public class LocalAccountFactoryBean implements FactoryBean<AccountRepository> {

	private String implType;



	public String getImplType() {
		return implType;
	}

	public void setImplType(String implType) {
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
