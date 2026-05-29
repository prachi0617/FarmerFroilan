package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.animal.Edible;

public class TomatoPlant {

    private final boolean hasBeenFertilized;

    public TomatoPlant(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Edible yield() {
        return hasBeenFertilized ? null : new Tomato();
    }
}
