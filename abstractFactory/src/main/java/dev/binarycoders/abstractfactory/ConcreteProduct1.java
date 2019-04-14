package dev.binarycoders.abstractfactory;

public class ConcreteProduct1 extends AbstractProduct {

	public ConcreteProduct1() {
		System.out.println("Creating product 1...");
	}

	@Override
	public void operation1() {
		System.out.println("Executing ConcreteProduct1::operation1...");
	}

	@Override
	public void operation2() {
		System.out.println("Executing ConcreteProduct1::operation2...");
	}
}
