package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public abstract class Vehicle implements NoiseMaker, Rideable {
    private String name;
    private boolean mounted;

    public Vehicle(String name) {
        this.name = name;
        this.mounted = false;
    }

    public String getName() {
        return name;
    }

    @Override
    public void beMounted(Rider rider) {
        this.mounted = true;
    }

    @Override
    public void beDismounted(Rider rider) {
        this.mounted = false;
    }

    @Override
    public boolean isMounted() {
        return mounted;
    }
}
