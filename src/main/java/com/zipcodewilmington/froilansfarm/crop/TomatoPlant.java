package com.zipcodewilmington.froilansfarm.crop;

public class TomatoPlant extends Crop<Tomato> {

    public TomatoPlant() {
        super(false, false);
    }

    public TomatoPlant(boolean fertilized, boolean harvested) {
        super(fertilized, harvested);
    }

    @Override
    public Tomato yield() {
        if (hasBeenFertilized() && hasBeenHarvested()) {
            return new Tomato();
        }

        return null;
    }
}