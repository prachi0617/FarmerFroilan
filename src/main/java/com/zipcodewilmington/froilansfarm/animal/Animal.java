package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal<T extends Edible> implements NoiseMaker, Eater<T> {

    private boolean hasEaten;
    private final List<T> meals = new ArrayList<>();

    @Override
    public void eat(T edible) {
        if (edible != null) {
            this.hasEaten = true;
            meals.add(edible);
        }
    }

    public List<T> getMealsEaten() {
        return new ArrayList<>(meals);
    }

    public boolean hasEaten() {
        return hasEaten;
    }
}
