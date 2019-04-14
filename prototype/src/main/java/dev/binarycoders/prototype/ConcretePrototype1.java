package dev.binarycoders.prototype;

public class ConcretePrototype1 extends Prototype {

    private String ownProperty1;

    public ConcretePrototype1() {
    }

    public ConcretePrototype1(final ConcretePrototype1 prototype) {
        super(prototype);

        ownProperty1 = prototype.ownProperty1;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this);
    }

    public String getOwnProperty1() {
        return ownProperty1;
    }

    public void setOwnProperty1(final String ownProperty1) {
        this.ownProperty1 = ownProperty1;
    }
}
