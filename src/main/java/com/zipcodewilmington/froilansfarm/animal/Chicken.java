package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {

    private boolean fertilized;

    public Chicken() {
        this.fertilized = false;
    }

    public Chicken(boolean fertilized) {
        this.fertilized = fertilized;
    }

    @Override
    public String makeNoise() {
        return "Cluck";
    }

    @Override
    public Edible yield() {
        if (fertilized) {
            return null;
        }

        return new Egg();
    }

    @Override
    public boolean isFertilized() {
        return fertilized;
    }

    @Override
    public void setFertilized(boolean fertilized) {
        this.fertilized = fertilized;
    }
}
