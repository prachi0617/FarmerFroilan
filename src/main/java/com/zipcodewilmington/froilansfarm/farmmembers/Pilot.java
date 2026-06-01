package com.zipcodewilmington.froilansfarm.farmmembers;

public class Pilot extends FarmMember implements com.zipcodewilmington.froilansfarm.interfaces.Pilot {

    public Pilot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        // No-op pilot fly implementation for tests
    }
}
