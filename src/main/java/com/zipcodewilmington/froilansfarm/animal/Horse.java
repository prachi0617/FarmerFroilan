package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Horse extends Animal implements Rideable {

    private boolean mounted;

    public Horse() {
        this.mounted = false;
    }

    @Override
    public String makeNoise() {
        return "Neigh";
    }

    @Override
    public void beMounted(Rider rider) {
        this.mounted = true;
    }

    public void beMounted() {
        this.beMounted((Rider) null);
    }

    @Override
    public void beDismounted(Rider rider) {
        this.mounted = false;
    }

    public void beDismounted() {
        this.beDismounted((Rider) null);
    }

    @Override
    public boolean isMounted() {
        return mounted;
    }

    public boolean isOccupied() {
        return isMounted();
    }
}