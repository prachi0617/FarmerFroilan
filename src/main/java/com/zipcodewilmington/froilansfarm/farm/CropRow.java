package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import java.util.ArrayList;
import java.util.List;

public class CropRow<T extends Crop<?>> {

    private final List<T> crops = new ArrayList<>();

    public void add(T crop) {
        if (crop != null) {
            crops.add(crop);
        }
    }

    public List<T> getCrops() {
        return new ArrayList<>(crops);
    }
}
