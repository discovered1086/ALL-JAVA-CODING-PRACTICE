package com.kingshuk.corejava.generics.genericclass;

import java.util.ArrayList;
import java.util.List;

public class GenericClassDemo {

    public static void main(String[] args) {
        ShowRoom<PassengerCar> showRoom = new ShowRoom<>();

        List<PassengerCar> vehicles = new ArrayList<>();
        vehicles.add(new PassengerCar());

        showRoom.setVehicles(vehicles);

    }
}
