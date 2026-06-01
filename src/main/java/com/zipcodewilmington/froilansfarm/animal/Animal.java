package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements NoiseMaker, Eater {

    private boolean hasEaten;
    private final List<Edible> meals = new ArrayList<>();

    @Override
    public void eat(Edible edible) {
        if (edible != null) {
            this.hasEaten = true;
            meals.add(edible);
        }
    }

    public List<Edible> getMealsEaten() {
        return new ArrayList<>(meals);
    }

    public boolean hasEaten() {
        return hasEaten;
    }
}
