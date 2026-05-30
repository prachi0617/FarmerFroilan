package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Animal implements NoiseMaker, Eater {

    private boolean hasEaten;

    @Override
    public void eat(Edible edible) {
        this.hasEaten = true;
    }

    public boolean hasEaten() {
        return hasEaten;
    }
}
