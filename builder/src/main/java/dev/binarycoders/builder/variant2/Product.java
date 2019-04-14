package dev.binarycoders.builder.variant2;

public class Product {

	private String a;
	private String b;

	public String getA() {
		return this.a;
	}

	public Product setA(final String a) {
		this.a = a;
		return this;
	}

	public String getB() {
		return this.b;
	}

	public Product setB(final String b) {
		this.b = b;
		return this;
	}

	@Override
	public String toString() {
		return "Product{" + "a=" + a + ", b=" + b + '}';
	}
}
