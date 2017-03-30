package com.wordpress.binarycoders.abstractfactory;

public class ConcreteProduct2 extends AbstractProduct {

	public ConcreteProduct2() {
		System.out.println("Creating product 2...");
	}

	@Override
	public void operation1() {
		System.out.println("Executing Product2::operation1...");
	}

	@Override
	public void operation2() {
		System.out.println("Executing Product2::operation2...");
	}
}
