package com.kingshuk.corejava.basic.inheritance.superkeyword;

public class Car extends Vehicle {

    private String brand;

    private String transmission;

    public Car(String brand, String transmission, String fuel, double price) {
        super(price, fuel);
        this.brand = brand;
        this.transmission = transmission;
        System.out.println("In the arg constructor of Vehicle");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
