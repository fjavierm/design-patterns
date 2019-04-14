package dev.binarycoders.abstractfactory;

public class ConcreteFactory2 extends AbstractFactory {

	@Override
	public AbstractProduct createProduct() {
		return new ConcreteProduct2();
	}
}
