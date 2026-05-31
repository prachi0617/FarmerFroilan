package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

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
    }

    @Override
    public void fly() {
    }

    @Override
    public void beMounted(Rider rider) {
    }

    @Override
    public void beDismounted(Rider rider) {
    }

    public void fertilize(CropRow<?> cropRow) {
        for (Crop crop : cropRow.getCrops()) {
                crop.fertilize();
            }
    }
    
}
