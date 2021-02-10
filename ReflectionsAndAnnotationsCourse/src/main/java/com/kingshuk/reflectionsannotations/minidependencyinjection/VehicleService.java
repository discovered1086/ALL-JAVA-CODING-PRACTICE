package com.kingshuk.reflectionsannotations.minidependencyinjection;

import com.kingshuk.reflectionsannotations.minidependencyinjection.annotations.InjectDependency;
import com.kingshuk.reflectionsannotations.minidependencyinjection.model.Vehicle;
import com.kingshuk.reflectionsannotations.minidependencyinjection.repository.IVehicleRepository;

public class VehicleService {

    @InjectDependency
    private IVehicleRepository vehicleRepository;

    public void addVehicle(Vehicle vehicle){
        vehicleRepository.addVehicle(vehicle);
    }

    public Vehicle getVehicle(Integer id){
        return vehicleRepository.getVehicle(id);
    }
}
