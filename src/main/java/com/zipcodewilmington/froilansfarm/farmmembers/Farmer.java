package com.zipcodewilmington.froilansfarm.farmmembers;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;

public class Farmer extends FarmMember implements Botanist {

    public Farmer(String name) {
        super(name);
    }

    public <T extends Crop<?>> void plant(T crop, CropRow<T> cropRow) {
        if (crop != null && cropRow != null) {
            cropRow.add(crop);
        }
    }
}
