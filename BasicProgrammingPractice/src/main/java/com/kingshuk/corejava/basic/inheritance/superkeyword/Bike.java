package com.kingshuk.corejava.basic.inheritance.superkeyword;

public class Bike extends Vehicle {

    private String brand;

    private String type;

    public Bike() {
        this(2000.00, "petrol", "Honda", "Cruiser");
        System.out.println("In the no-arg constructor of Bike ");
    }

    Bike(double price, String fuel, String brand, String type) {
        //super(price, fuel);
        this.brand = brand;
        this.type = type;
        System.out.println("In the parameterized constructor of Bike ");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bike{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", price='").append(super.getPrice()).append('\'');
        sb.append(", fuel='").append(super.getFuel()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
