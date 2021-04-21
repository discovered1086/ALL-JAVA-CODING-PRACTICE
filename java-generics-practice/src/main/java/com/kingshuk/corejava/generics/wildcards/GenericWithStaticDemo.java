package com.kingshuk.corejava.generics.wildcards;

import com.kingshuk.corejava.generics.wildcards.model.Cage;
import com.kingshuk.corejava.generics.wildcards.model.Cat;
import com.kingshuk.corejava.generics.wildcards.model.Dog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenericWithStaticDemo {
    private static final Logger logger = LoggerFactory.getLogger(GenericWithStaticDemo.class);

    public static void main(String[] args) {
        final boolean compatible = Cage.isCompatible(new Cat("Rai"), new Dog("Tommy", "labrador"));

        logger.info("Are the animals compatible? {}", compatible);
    }
}
