package com.proje.model;


public class BankFactory { //Factory Design Pattern
	public static banka createBanka(Class aClass) throws IllegalAccessException, InstantiationException {
		return (banka) aClass.newInstance();
	}

}
