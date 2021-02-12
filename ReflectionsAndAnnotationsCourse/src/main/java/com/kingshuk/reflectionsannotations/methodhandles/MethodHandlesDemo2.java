package com.kingshuk.reflectionsannotations.methodhandles;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;

public class MethodHandlesDemo2 {

    public static void main(String[] args) throws Throwable {
        Vehicle vehicle = Vehicle.builder()
                .vin("1N4BL4BV2KC239749")
                .make("Honda")
                .model("Pilot")
                .year(2019)
                .build();

        System.out.println(vehicle);

        final Lookup lookup = MethodHandles.lookup();

        Class<?> aClass = lookup.findClass(Vehicle.class.getName());

        final MethodType methodType = MethodType.methodType(int.class);

        final MethodHandle getVehicleCount = lookup.findStatic(aClass, "getVehicleCount", methodType);

        System.out.println("Vehicle count:" + getVehicleCount.invoke());



    }
}
