package com.kingshuk.corejava.basic.assignments.parkinglot;

public class ParkingLot {
    private final int totalAvailableSpaces;
    private ParkingSpace [] parkingSpaces;
    private int availableSpaces;

    public ParkingLot(int availableSpaces) {
        this.totalAvailableSpaces = availableSpaces;
        parkingSpaces=new ParkingSpace[totalAvailableSpaces];
    }

    public int getTotalAvailableSpaces() {
        return totalAvailableSpaces;
    }

    public int getAvailableSpaces() {
        return availableSpaces;
    }

    public void setAvailableSpaces(int availableSpaces) {
        this.availableSpaces = availableSpaces;
    }

    public ParkingSpace[] getParkingSpaces() {
        return parkingSpaces;
    }
}
