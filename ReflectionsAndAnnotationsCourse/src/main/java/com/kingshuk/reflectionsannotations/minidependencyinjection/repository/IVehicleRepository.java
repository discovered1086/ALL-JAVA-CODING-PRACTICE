package com.kingshuk.reflectionsannotations.minidependencyinjection.repository;


import com.kingshuk.reflectionsannotations.minidependencyinjection.model.Vehicle;

public interface IVehicleRepository {

    void addVehicle(Vehicle vehicle);

    Vehicle getVehicle(int id);

}
