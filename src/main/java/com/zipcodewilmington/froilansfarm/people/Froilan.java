package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Froilan extends Animal implements Rider, Botanist {

    @Override
    public String makeNoise() {
        return "Howdy";
    }

    @Override
    public void mount(Rideable rideable) {
        rideable.beMounted(this);
    }

    @Override
    public void dismount(Rideable rideable) {
        rideable.beDismounted(this);
    }

    @Override
    public void plant(Crop crop, CropRow<?> cropRow) {
        cropRow.addCrop(crop);
    }
}
