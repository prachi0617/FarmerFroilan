package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.animal.Edible;

public class CornStalk {
    private final boolean hasBeenFertilized;

    public CornStalk(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Edible yield() {
        return hasBeenFertilized ? null : new Corn();
    }
}
