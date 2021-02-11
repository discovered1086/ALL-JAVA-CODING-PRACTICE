package com.kingshuk.reflectionsannotations.minidependencyinjection.repository.impl;


import com.kingshuk.reflectionsannotations.minidependencyinjection.annotations.InjectDependency;
import com.kingshuk.reflectionsannotations.minidependencyinjection.annotations.Repository;
import com.kingshuk.reflectionsannotations.minidependencyinjection.model.Vehicle;
import com.kingshuk.reflectionsannotations.minidependencyinjection.repository.IVehicleRepository;

import java.util.concurrent.ConcurrentHashMap;

@Repository
public class VehicleRepository implements IVehicleRepository {

    @InjectDependency
    private static ConcurrentHashMap<Integer, Vehicle> vehicles;


    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getId(), vehicle);
    }

    @Override
    public Vehicle getVehicle(int id) {
        return vehicles.get(id);
    }
}
