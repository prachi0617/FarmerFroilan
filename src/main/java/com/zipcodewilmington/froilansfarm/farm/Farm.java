package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;

import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.vehicles.FarmVehicle;

public class Farm {

    private Field field;

    private final List<FarmVehicle> vehicles = new ArrayList<>();
    private final List<Aircraft> aircraft = new ArrayList<>();

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public void addVehicle(FarmVehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addAircraft(Aircraft aircraft) {
        this.aircraft.add(aircraft);
    }
}