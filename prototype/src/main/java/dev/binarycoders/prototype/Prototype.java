package dev.binarycoders.prototype;

public abstract class Prototype {

    private int propertyA;
    private int propertyB;
    private String propertyC;

    public Prototype() {
    }

    public Prototype(final Prototype prototype) {
        propertyA = prototype.propertyA;
        propertyB = prototype.propertyB;
        propertyC = prototype.propertyC;
    }

    public abstract Prototype clone();

    public int getPropertyA() {
        return propertyA;
    }

    public void setPropertyA(final int propertyA) {
        this.propertyA = propertyA;
    }

    public int getPropertyB() {
        return propertyB;
    }

    public void setPropertyB(final int propertyB) {
        this.propertyB = propertyB;
    }

    public String getPropertyC() {
        return propertyC;
    }

    public void setPropertyC(final String propertyC) {
        this.propertyC = propertyC;
    }
}
