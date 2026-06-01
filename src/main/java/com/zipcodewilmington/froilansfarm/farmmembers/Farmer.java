package com.zipcodewilmington.froilansfarm.farmmembers;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;

public class Farmer extends FarmMember {

    public Farmer(String name) {
        super(name);
    }

    public <T extends Crop> void plant(T crop, CropRow<T> cropRow) {
        if (crop != null && cropRow != null) {
            cropRow.add(crop);
        }
    }
}
