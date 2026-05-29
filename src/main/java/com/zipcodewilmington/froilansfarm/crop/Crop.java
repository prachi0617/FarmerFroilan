package com.zipcodewilmington.froilansfarm.crop;

public class Crop {

    private boolean hasBeenFertilized;

    public Crop() {
        this(false);
    }

    public Crop(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }
}
