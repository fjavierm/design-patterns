package dev.binarycoders.builder;

public class Director {

	public Product construct(final Builder builder) {
		builder.buildA();
		builder.buildB();
		builder.buildC();

		return builder.getProduct();
	}
}
