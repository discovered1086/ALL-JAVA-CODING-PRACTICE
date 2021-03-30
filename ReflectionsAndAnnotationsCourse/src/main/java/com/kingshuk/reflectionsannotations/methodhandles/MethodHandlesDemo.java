package com.kingshuk.reflectionsannotations.methodhandles;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;

public class MethodHandlesDemo {

    public static void main(String[] args) throws Throwable {
        Vehicle vehicle = Vehicle.builder()
                .vin("1N4BL4BV2KC239749")
                .build();
        final Lookup lookup = MethodHandles.lookup();

        Class<?> aClass = lookup.findClass(Vehicle.class.getName());

        MethodType methodType = MethodType.methodType(String.class);

        final MethodHandle methodHandle = lookup.findVirtual(aClass, "getVin", methodType);

        System.out.println(methodHandle.invoke(vehicle));

        //Building a constructor handle
        final MethodHandle constructor = lookup.findConstructor(aClass, MethodType.methodType(void.class));

        final Vehicle vehicle2 = (Vehicle) constructor.invoke();
        vehicle2.setVin("1N4BL4BV2KC239760");
        System.out.println(vehicle2);
        System.out.println("Vehicle count:" + Vehicle.getVehicleCount());

        //Calling constructor with arguments
        final MethodType methodType1 = MethodType.methodType(void.class,
                int.class, String.class, String.class, String.class, int.class);

        final MethodHandle constructor1 = lookup.findConstructor(aClass, methodType1);
        final Vehicle vehicle3 = (Vehicle) constructor1.invoke(1, "1N4BL4BV2KC4579", "Honda", "Civic", 2020);

        System.out.println(vehicle3);
        System.out.println("Vehicle count:" + Vehicle.getVehicleCount());

        //Let's populate the second object via reflection
        //The first parameter to methodType method here is the return type
        //followed by the argument types
        final MethodType methodType2 = MethodType.methodType(void.class, String.class);
        final MethodHandle setModel = lookup.findVirtual(aClass, "setModel", methodType2);
        final MethodHandle setMake = lookup.findVirtual(aClass, "setMake", methodType2);

        //The first parameter here is the instance of the object on which
        //I want to call this method, second parameter is the value of the argument.
        setModel.invoke(vehicle2, "Ridgeline");
        setMake.invoke(vehicle2, "Honda");

        System.out.println(vehicle2);
        System.out.println("Vehicle count:" + Vehicle.getVehicleCount());

    }
}
