package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class CornStalk extends Crop {

    public CornStalk() {
        super(false, false);
    }

    public CornStalk(boolean fertilized, boolean harvested) {
        super(fertilized, harvested);
    }

    @Override
    public Edible yield() {
        if (hasBeenFertilized() && hasBeenHarvested()) {
            return new EarCorn();
        }

        return null;
    }
}