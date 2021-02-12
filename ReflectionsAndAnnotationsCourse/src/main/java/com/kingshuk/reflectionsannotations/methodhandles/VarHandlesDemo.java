package com.kingshuk.reflectionsannotations.methodhandles;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.VarHandle;

public class VarHandlesDemo {

    public static void main(String[] args) throws Exception {
        Vehicle vehicle = Vehicle.builder()
                .vin("1N4BL4BV2KC239749")
                .model("Pilot")
                .year(2019)
                .build();

        System.out.println(vehicle);

        final Lookup privateLookup = MethodHandles.privateLookupIn(Vehicle.class, MethodHandles.lookup());

        Class<?> aClass = privateLookup.findClass(Vehicle.class.getName());

        final VarHandle model = privateLookup.findVarHandle(aClass, "model", String.class);

        final String modelValue = (String) model.get(vehicle);

        System.out.println("The model is: " + modelValue);

        model.set(vehicle, "Passport");

        System.out.println("The model is: " + (String) model.get(vehicle));
    }
}
