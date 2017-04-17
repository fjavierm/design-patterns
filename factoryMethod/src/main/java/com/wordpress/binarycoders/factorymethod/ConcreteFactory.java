package com.wordpress.binarycoders.factorymethod;

public class ConcreteFactory extends FactoryBase {

	@Override
	public ProductBase build(int type) {
		final ProductBase productBase;

		switch (type) {
			case 1:
				productBase = new ConcreteProduct1();
				break;

			case 2:
				productBase = new ConcreteProduct2();
				break;

			default:
				throw new IllegalArgumentException(String.format("Illegal type %s", type));
		}

		return productBase;
	}
}
