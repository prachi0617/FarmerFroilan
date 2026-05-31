package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.animal.Edible;
import com.zipcodewilmington.froilansfarm.crop.Yields.EarCorn;

public class CornStalk extends Crop {

    public CornStalk() {
        super();
    }

    public CornStalk(boolean fertilized, boolean harvested) {
        super(fertilized, harvested);
    }

    public Edible yield() {

        if (hasBeenFertilized() && hasBeenHarvested()) {
            return new EarCorn();
        }

        return null;
    }
}