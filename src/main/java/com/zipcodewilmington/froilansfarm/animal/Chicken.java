package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Chicken extends Animal {

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

    public Edible yield() {
        if (fertilized) {
            return null;
        }

        return new Egg();
    }
}