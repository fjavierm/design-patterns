package dev.binarycoders.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final List<Prototype> prototypes = new ArrayList<>();
        final ConcretePrototype1 cp1 = new ConcretePrototype1();
        final ConcretePrototype2 cp2 = new ConcretePrototype2();

        prototypes.add(cp1);
        prototypes.add(cp2);

        // We can now copy the list without worrying about what
        // specific type is the object
        final List<Prototype> newPrototypes = new ArrayList<>();

        for (final Prototype p : prototypes) {
            newPrototypes.add(p.clone());
        }
    }
}
