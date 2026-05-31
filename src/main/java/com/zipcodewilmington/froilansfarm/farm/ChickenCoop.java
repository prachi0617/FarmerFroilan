package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;

import com.zipcodewilmington.froilansfarm.animal.Chicken;

public class ChickenCoop {

    private final List<Chicken> chickens = new ArrayList<>();

    public void add(Chicken chicken) {
        chickens.add(chicken);
    }

    public List<Chicken> getChickens() {
        return chickens;
    }
}