package com.wordpress.binarycoders.builder;

public class ConcreteBuilder extends Builder {

	private final Product product = new Product();

	@Override
	public void buildA() {
		this.product.setA("A");
	}

	@Override
	public void buildB() {
		this.product.setB("B");
	}

	@Override
	public void buildC() {
		this.product.setC("C");
	}

	@Override
	public Product getProduct() {
		return this.product;
	}
}
