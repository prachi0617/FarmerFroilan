package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Horse;
import java.util.ArrayList;
import java.util.List;

public class Stable {

    private final List<Horse> horses = new ArrayList<>();

    public void add(Horse horse) {
        if (horse != null) {
            horses.add(horse);
        }
    }

    public List<Horse> getHorses() {
        return new ArrayList<>(horses);
    }
}
