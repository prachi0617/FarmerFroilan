package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;

public interface Botanist {
    <T extends Crop<?>> void plant(T crop, CropRow<T> cropRow);
}
