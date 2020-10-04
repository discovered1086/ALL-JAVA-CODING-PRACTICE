package com.kingshuk.corejava.basic.assignments.parkinglot;

public abstract class Vehicle {
    private String plateNumber;
    private boolean isHandicapped;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public boolean isHandicapped() {
        return isHandicapped;
    }

    public void setHandicapped(boolean handicapped) {
        isHandicapped = handicapped;
    }
}
