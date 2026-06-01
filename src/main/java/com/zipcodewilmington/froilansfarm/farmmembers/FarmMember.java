package com.zipcodewilmington.froilansfarm.farmmembers;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public abstract class FarmMember implements Rider, Eater {

    private final String name;
    private boolean hasEaten;

    public FarmMember(String name) {
        this.name = name;
        this.hasEaten = false;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat(Edible edible) {
        if (edible != null) {
            this.hasEaten = true;
        }
    }

    public boolean hasEaten() {
        return hasEaten;
    }

    @Override
    public void mount(Rideable rideable) {
        if (rideable != null) {
            rideable.beMounted(this);
        }
    }

    @Override
    public void dismount(Rideable rideable) {
        if (rideable != null) {
            rideable.beDismounted(this);
        }
    }

    public void ride(Rideable rideable) {
        // Riding does not change mount state until dismount is called
    }

    public boolean isHungry() {
        return !hasEaten;
    }
}
