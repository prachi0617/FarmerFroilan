package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;

import com.zipcodewilmington.froilansfarm.animal.Horse;

public class Stable {

    private final List<Horse> horses = new ArrayList<>();

    public void add(Horse horse) {
        horses.add(horse);
    }

    public List<Horse> getHorses() {
        return horses;
    }
}