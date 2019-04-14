package dev.binarycoders.prototype;

public class ConcretePrototype2 extends Prototype {

    private String ownProperty2;

    public ConcretePrototype2() {
    }

    public ConcretePrototype2(final ConcretePrototype2 prototype) {
        super(prototype);

        ownProperty2 = prototype.ownProperty2;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this);
    }

    public String getOwnProperty2() {
        return ownProperty2;
    }

    public void setOwnProperty2(final String ownProperty2) {
        this.ownProperty2 = ownProperty2;
    }
}
