package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farmmembers.Farmer;
import com.zipcodewilmington.froilansfarm.farmmembers.Pilot;
import java.util.ArrayList;
import java.util.List;

public class FarmHouse {

    private final List<Farmer> farmers = new ArrayList<>();
    private final List<Pilot> pilots = new ArrayList<>();

    public void addFarmer(Farmer farmer) {
        if (farmer != null) {
            farmers.add(farmer);
        }
    }

    public void addPilot(Pilot pilot) {
        if (pilot != null) {
            pilots.add(pilot);
        }
    }

    public Farmer getFarmer(String name) {
        if (name == null) {
            return null;
        }
        return farmers.stream()
                .filter(f -> name.equals(f.getName()))
                .findFirst()
                .orElse(null);
    }

    public Pilot getPilot(String name) {
        if (name == null) {
            return null;
        }
        return pilots.stream()
                .filter(p -> name.equals(p.getName()))
                .findFirst()
                .orElse(null);
    }
}
