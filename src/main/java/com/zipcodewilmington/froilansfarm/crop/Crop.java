package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public abstract class Crop {

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public Crop() {
        this(false, false);
    }

    public Crop(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        this.hasBeenFertilized = hasBeenFertilized;
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void fertilize() {
        hasBeenFertilized = true;
    }

    public void harvest() {
        hasBeenHarvested = true;
    }

    public abstract Edible yield();
}