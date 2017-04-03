package com.wordpress.binarycoders.builder.variant1;

public class Product {

	private final String a;
	private final String b;
	private final String c;
	private final String d;
	private final String e;

	private Product(ProductBuilder productBuilder) {
		this.a = productBuilder.a;
		this.b = productBuilder.b;
		this.c = productBuilder.c;
		this.d = productBuilder.d;
		this.e = productBuilder.e;
	}

	public String getA() {
		return a;
	}

	public String getB() {
		return b;
	}

	public String getC() {
		return c;
	}

	public String getD() {
		return d;
	}

	public String getE() {
		return e;
	}

	@Override
	public String toString() {
		return "Product{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + '}';
	}

	public static class ProductBuilder {

		private final String a;
		private final String b;
		private String c; // Optional
		private String d; // Optional
		private String e; // Optional

		public ProductBuilder(String a, String b) {
			this.a = a;
			this.b = b;
		}

		public ProductBuilder setC(final String c) {
			this.c = c;
			return this;
		}

		public ProductBuilder setD(final String d) {
			this.d = d;
			return this;
		}

		public ProductBuilder setE(final String e) {
			this.e = e;
			return this;
		}

		public Product build() {
			return new Product(this);
		}
	}
}
