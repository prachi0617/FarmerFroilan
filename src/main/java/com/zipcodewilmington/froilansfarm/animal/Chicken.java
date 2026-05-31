package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized;

    public Chicken() {
        this.hasBeenFertilized = false;
    }

    public Chicken(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    @Override
    public boolean isFertilized() {
        return hasBeenFertilized;
    }

    @Override
    public void setFertilized(boolean fertilized) {
        this.hasBeenFertilized = fertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public String makeNoise() {
        return "Cluck";
    }

    @Override
    public Edible yield() {
        if (!hasBeenFertilized) {
            return new EdibleEgg();
        }

        return null;
    }
}