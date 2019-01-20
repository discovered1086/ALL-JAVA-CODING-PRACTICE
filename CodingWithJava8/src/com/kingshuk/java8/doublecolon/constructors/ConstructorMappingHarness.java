package com.kingshuk.java8.doublecolon.constructors;

public class ConstructorMappingHarness {
    public static void main(String[] args) {
        //Person kingshuk = new Person("Kingshuk", 32);

        /**
         * Instead of calling the constructor directly, we can always
         * call the method of the functional interface
         *
         * This can be used in two ways I think,
         * 1) As a replacement of reflection API calls
         * 2) As a factory method
         */
        PersonPrinter printer = Person::new;

        printer.printPerson("Kingshuk",32);
    }
}
