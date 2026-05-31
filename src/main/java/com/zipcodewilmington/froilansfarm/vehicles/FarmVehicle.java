package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.farm.Farm;

public abstract class FarmVehicle extends Vehicle {

    public FarmVehicle(String name) {
        super(name);
    }

    public abstract void operate(Farm farm);
}
