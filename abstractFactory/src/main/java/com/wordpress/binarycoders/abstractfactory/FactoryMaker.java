package com.wordpress.binarycoders.abstractfactory;

public class FactoryMaker {

	public static AbstractFactory getFactory(final ProductType productType) {
		final AbstractFactory abstractFactory;

		switch (productType) {
			case PRODUCT_1:
				abstractFactory = new ConcreteFactory1();
				break;

			case PRODUCT_2:
				abstractFactory = new ConcreteFactory2();
				break;

			default:
				throw new IllegalArgumentException("The product type does not exist.");
		}

		return abstractFactory;
	}
}
