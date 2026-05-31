package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;

import com.zipcodewilmington.froilansfarm.crop.Crop;

public class CropRow<T extends Crop> {

    private final List<T> crops = new ArrayList<>();

    public void addCrop(T crop) {
        crops.add(crop);
    }

    public List<T> getCrops() {
        return crops;
    }
}