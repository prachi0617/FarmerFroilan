package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Froilanda extends Animal implements Rider, Pilot {

    @Override
    public String makeNoise() {
        return "Howdy";
    }

    @Override
    public void mount(Rideable rideable) {
        rideable.beMounted(this);
    }

    @Override
    public void dismount(Rideable rideable) {
        rideable.beDismounted(this);
    }

    @Override
    public void fly() {
    }
}
