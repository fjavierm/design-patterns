package dev.binarycoders.abstractfactory;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		Arrays.stream(ProductType.values())
				.forEach(productType -> {
					AbstractFactory abstractFactory = FactoryMaker.getFactory(productType);
					AbstractProduct product = abstractFactory.createProduct();

					product.operation1();
					product.operation2();
				});
	}
}
