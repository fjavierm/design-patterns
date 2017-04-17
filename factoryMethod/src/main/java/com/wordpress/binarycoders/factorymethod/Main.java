package com.wordpress.binarycoders.factorymethod;

public class Main {

	public static void main(String[] args) {
		final FactoryBase factoryBase = new ConcreteFactory();

		factoryBase.build(1).whoIAm();
		factoryBase.build(2).whoIAm();
	}
}
