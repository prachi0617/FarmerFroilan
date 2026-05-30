package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public abstract class Crop {

    private boolean fertilized;
    private boolean harvested;

    public Crop(boolean fertilized, boolean harvested) {
        this.fertilized = fertilized;
        this.harvested = harvested;
    }

    public void fertilize() {
        this.fertilized = true;
    }

    public void harvest() {
        this.harvested = true;
    }

    public boolean hasBeenFertilized() {
        return fertilized;
    }

    public boolean hasBeenHarvested() {
        return harvested;
    }

    public abstract Edible yield();
}