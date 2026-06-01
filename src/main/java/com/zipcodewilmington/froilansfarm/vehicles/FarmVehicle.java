package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.farm.Farm;

public abstract class FarmVehicle extends Vehicle {

    private boolean operating;

    public FarmVehicle(String name) {
        super(name);
        this.operating = false;
    }

    public abstract void operate(Farm farm);

    protected void setOperating(boolean operating) {
        this.operating = operating;
    }

    public boolean isOperating() {
        return operating;
    }
}
