package com.kingshuk.corejava.basic.assignments.parkinglot;

public class ParkingSpacesUtil {
    private static ParkingLot parkingLot;

    static {
       parkingLot=new ParkingLot(10);
    }

    public static void initializeParkingLot(){

        ParkingSpace parkingSpace=new SmallParkingSpace();
        parkingSpace.setHandicappedSpace(false);
        parkingSpace.setParkingSpaceNumber(1);

        parkingLot.getParkingSpaces()[0]=parkingSpace;

        ParkingSpace parkingSpace2=new SmallParkingSpace();
        parkingSpace.setHandicappedSpace(true);
        parkingSpace.setParkingSpaceNumber(2);

        parkingLot.getParkingSpaces()[1]=parkingSpace2;

        ParkingSpace parkingSpace3=new MediumParkingSpace();
        parkingSpace.setHandicappedSpace(false);
        parkingSpace.setParkingSpaceNumber(3);

        parkingLot.getParkingSpaces()[2]=parkingSpace3;

        ParkingSpace parkingSpace4=new MediumParkingSpace();
        parkingSpace.setHandicappedSpace(false);
        parkingSpace.setParkingSpaceNumber(4);

        parkingLot.getParkingSpaces()[3]=parkingSpace4;

        ParkingSpace parkingSpace5=new MediumParkingSpace();
        parkingSpace.setHandicappedSpace(false);
        parkingSpace.setParkingSpaceNumber(5);

        parkingLot.getParkingSpaces()[4]=parkingSpace5;

        ParkingSpace parkingSpace6=new MediumParkingSpace();
        parkingSpace.setHandicappedSpace(true);
        parkingSpace.setParkingSpaceNumber(6);

        parkingLot.getParkingSpaces()[5]=parkingSpace6;

        ParkingSpace parkingSpace7=new LargeParkingSpace();
        parkingSpace.setHandicappedSpace(false);
        parkingSpace.setParkingSpaceNumber(7);

        parkingLot.getParkingSpaces()[6]=parkingSpace7;

        ParkingSpace parkingSpace8=new LargeParkingSpace();
        parkingSpace.setHandicappedSpace(true);
        parkingSpace.setParkingSpaceNumber(8);

        parkingLot.getParkingSpaces()[7]=parkingSpace8;

        ParkingSpace parkingSpace9=new LargeParkingSpace();
        parkingSpace.setHandicappedSpace(false);
        parkingSpace.setParkingSpaceNumber(9);

        parkingLot.getParkingSpaces()[8]=parkingSpace9;

        ParkingSpace parkingSpace10=new MediumParkingSpace();
        parkingSpace.setHandicappedSpace(false);
        parkingSpace.setParkingSpaceNumber(10);

        parkingLot.getParkingSpaces()[9]=parkingSpace10;
    }

    public static ParkingLot getParkingLot() {
        return parkingLot;
    }
}
