package com.kingshuk.corejava.basic.inheritance.superkeyword;

public class Vehicle {

    private double price;

    private String fuel;

    public Vehicle() {
        System.out.println("In the no-arg constructor of Vehicle");
    }

    public Vehicle(double price, String fuel) {
        System.out.println("In the parameterized constructor of Vehicle");
        this.price = price;
        this.fuel = fuel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
