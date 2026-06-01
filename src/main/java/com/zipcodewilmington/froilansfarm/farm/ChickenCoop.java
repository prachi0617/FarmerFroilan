package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {

    private final List<Chicken> chickens = new ArrayList<>();

    public void add(Chicken chicken) {
        if (chicken != null) {
            chickens.add(chicken);
        }
    }

    public List<Chicken> getChickens() {
        return new ArrayList<>(chickens);
    }
}
