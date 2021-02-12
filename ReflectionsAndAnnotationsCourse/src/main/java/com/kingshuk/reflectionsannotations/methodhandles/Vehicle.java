package com.kingshuk.reflectionsannotations.methodhandles;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Vehicle {

    private int id;

    private String vin;

    private String make;

    private String model;

    private int year;

    private static int vehicleCount;

    public static int getVehicleCount(){
        return vehicleCount;
    }

    public Vehicle() {
        vehicleCount++;
    }

    public Vehicle(int id, String vin, String make, String model, int year) {
        vehicleCount++;
        this.id = id;
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
