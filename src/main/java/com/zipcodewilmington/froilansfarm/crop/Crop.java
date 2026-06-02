package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop<T extends Edible> implements Produce<T> {

    private boolean fertilized;
    private boolean harvested;

    public Crop(boolean fertilized, boolean harvested) {
        this.fertilized = fertilized;
        this.harvested = harvested;
    }

    public void fertilize() {
        setFertilized(true);
    }

    @Override
    public void setFertilized(boolean fertilized) {
        this.fertilized = fertilized;
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

    public boolean isHarvested() {
        return hasBeenHarvested();
    }

    public boolean isFertilized() {
        return hasBeenFertilized();
    }

    public abstract T yield();
}