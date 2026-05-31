package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Tractor extends FarmVehicle {

    public Tractor() {
        super("Tractor");
    }

    @Override
    public String makeNoise() {
        return "Vroom";
    }

    @Override
    public void operate(Farm farm) {
    }

    @Override
    public void beMounted(Rider rider) {
    }

    @Override
    public void beDismounted(Rider rider) {
    }

    public void harvest(Crop crop) {
        crop.harvest();
    }
}
