package com.kingshuk.corejava.basic.assignments.parkinglot;

public class ParkingLotTestHarness {

    public static void park(Vehicle theVehicle){
        if(ParkingSpacesUtil.getParkingLot().getAvailableSpaces()!=0){
            if(theVehicle instanceof Car){
                for(ParkingSpace parkingSpace:ParkingSpacesUtil.getParkingLot().getParkingSpaces()){
                    if((parkingSpace instanceof MediumParkingSpace
                            || parkingSpace instanceof LargeParkingSpace)
                            && parkingSpace.isAvailable()){
                        if(theVehicle.isHandicapped() && parkingSpace.isHandicappedSpace()){
                            parkingSpace.setParkedVehicle(theVehicle);
                            parkingSpace.setAvailable(false);

                            System.out.println("The vehicle "+ theVehicle.getPlateNumber()
                            + " has been parked in parking space "+parkingSpace.getParkingSpaceNumber());
                        }
                    }
                }
            }else if(theVehicle instanceof Bike){

            }else{

            }
        }else{
            System.out.println("The Parking lot is full...!!");
        }
    }

    public static void main(String[] args) {
       ParkingSpacesUtil.initializeParkingLot();

       Vehicle car1=new Car();
       car1.setPlateNumber("123");
       car1.setHandicapped(false);
    }
}
