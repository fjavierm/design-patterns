package dev.binarycoders.builder.variant1;

public class Main {

	public static void main(String[] args) {
		System.out.print(new Product.ProductBuilder("A", "B")
				.setC("C")
				.setD("D")
				.setE("E")
				.build()
				.toString());
	}
}
