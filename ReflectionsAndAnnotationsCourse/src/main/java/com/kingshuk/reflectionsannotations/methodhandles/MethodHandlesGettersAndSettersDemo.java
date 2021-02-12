package com.kingshuk.reflectionsannotations.methodhandles;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;

public class MethodHandlesGettersAndSettersDemo {

    public static void main(String[] args) throws Throwable {
        Vehicle vehicle = Vehicle.builder()
                .vin("1N4BL4BV2KC239749")
                .model("Pilot")
                .year(2019)
                .build();

        System.out.println(vehicle);

        final Lookup privateLookup = MethodHandles.privateLookupIn(Vehicle.class, MethodHandles.lookup());

        Class<?> aClass = privateLookup.findClass(Vehicle.class.getName());

        final MethodHandle setMake = privateLookup.findSetter(aClass, "make", String.class);
        final MethodHandle getMake = privateLookup.findGetter(aClass, "make", String.class);
        setMake.invoke(vehicle,"Honda");

        System.out.println("Vehicle details is:" + vehicle);
        System.out.println("The make of the vehicle is: "+getMake.invoke(vehicle));



    }
}
