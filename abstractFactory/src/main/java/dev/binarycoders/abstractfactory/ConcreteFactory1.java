package dev.binarycoders.abstractfactory;

public class ConcreteFactory1 extends AbstractFactory {

	@Override
	public AbstractProduct createProduct() {
		return new ConcreteProduct1();
	}
}
