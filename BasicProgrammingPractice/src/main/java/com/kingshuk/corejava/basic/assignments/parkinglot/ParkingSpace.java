package com.kingshuk.corejava.basic.assignments.parkinglot;

public class ParkingSpace {
    private int parkingSpaceNumber;
    private boolean isHandicappedSpace;
    private Vehicle parkedVehicle;
    private boolean isAvailable=true;

    public ParkingSpace() {
    }

    public ParkingSpace(int parkingSpaceNumber, boolean isHandicappedSpace) {
        this.parkingSpaceNumber = parkingSpaceNumber;
        this.isHandicappedSpace = isHandicappedSpace;
    }

    public int getParkingSpaceNumber() {
        return parkingSpaceNumber;
    }

    public void setParkingSpaceNumber(int parkingSpaceNumber) {
        this.parkingSpaceNumber = parkingSpaceNumber;
    }

    public boolean isHandicappedSpace() {
        return isHandicappedSpace;
    }

    public void setHandicappedSpace(boolean handicappedSpace) {
        isHandicappedSpace = handicappedSpace;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
