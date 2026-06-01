package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;

public class CropDuster extends FarmVehicle implements Aircraft {

    public CropDuster() {
        super("CropDuster");
    }

    @Override
    public String makeNoise() {
        return "Whoosh";
    }

    @Override
    public void operate(Farm farm) {
        setOperating(true);
    }

    @Override
    public void fly() {
    }

    public void fertilize(CropRow<?> cropRow) {
        for (Crop crop : cropRow.getCrops()) {
            crop.fertilize();
        }
    }
}
