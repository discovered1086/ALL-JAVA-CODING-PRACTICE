package com.kingshuk.reflectionsannotations.minidependencyinjection;

import com.kingshuk.reflectionsannotations.minidependencyinjection.config.ApplicationConfig;
import com.kingshuk.reflectionsannotations.minidependencyinjection.model.Vehicle;

public class SpringDependencyHarness {

    public static void main(String[] args) throws Exception {

         ApplicationContext context = new ApplicationContext(ApplicationConfig.class);

        final VehicleService vehicleService = context.getBean(VehicleService.class);

        vehicleService.addVehicle(Vehicle.builder()
                .auth("Not Authorized")
                .id(1234)
                .program("MachE")
                .team("ABC")
                .vin("1N4BL4BV2KC239749")
                .build());

        final Vehicle vehicle = vehicleService.getVehicle(1234);

        System.out.println(vehicle);
    }
}
