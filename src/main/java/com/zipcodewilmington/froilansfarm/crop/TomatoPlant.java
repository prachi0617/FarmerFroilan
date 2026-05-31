package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.crop.Yields.Tomato;

public class TomatoPlant extends Crop {

    public TomatoPlant() {
        super();
    }

    public TomatoPlant(boolean fertilized, boolean harvested) {
        super(fertilized, harvested);
    }

    public Edible yield() {
        if (hasBeenFertilized() && hasBeenHarvested()) {
            return new Tomato();
        }
        return null;
    }
}
