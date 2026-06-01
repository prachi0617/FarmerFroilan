package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.farm.Farm;

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
        setOperating(true);
    }

    public void harvest(Crop crop) {
        if (crop == null) {
            throw new IllegalArgumentException("Crop cannot be null.");
        }

        if (!crop.isHarvested()) {
            crop.harvest();
        }
    }

    public void harvestField(Field field) {
        if (field == null) {
            return;
        }

        for (com.zipcodewilmington.froilansfarm.farm.CropRow<?> row : field.getRows()) {
            for (Crop crop : row.getCrops()) {
                harvest(crop);
            }
        }
    }
}
