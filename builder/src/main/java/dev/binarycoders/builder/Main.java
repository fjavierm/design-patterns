package dev.binarycoders.builder;

public class Main {

	public static void main(String[] args) {
		final Director director = new Director();
		final Product product = director.construct(new ConcreteBuilder());

		System.out.println(String.format("Product: A = %s, B = %s, C = %s",
				product.getA(), product.getB(), product.getC()));
	}
}
