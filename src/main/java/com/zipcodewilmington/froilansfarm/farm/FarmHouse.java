package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.farmmembers.Farmer;
import com.zipcodewilmington.froilansfarm.farmmembers.Pilot;
import com.zipcodewilmington.froilansfarm.interfaces.Person;
import java.util.ArrayList;
import java.util.List;

public class FarmHouse {

    private final List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        if (person != null) {
            people.add(person);
        }
    }

    public void addFarmer(Farmer farmer) {
        addPerson(farmer);
    }

    public void addPilot(Pilot pilot) {
        addPerson(pilot);
    }

    public Person getPerson(String name) {
        if (name == null) {
            return null;
        }
        return people.stream()
                .filter(p -> name.equals(p.getName()))
                .findFirst()
                .orElse(null);
    }

    public Farmer getFarmer(String name) {
        if (name == null) {
            return null;
        }
        return people.stream()
                .filter(Farmer.class::isInstance)
                .map(Farmer.class::cast)
                .filter(f -> name.equals(f.getName()))
                .findFirst()
                .orElse(null);
    }

    public Pilot getPilot(String name) {
        if (name == null) {
            return null;
        }
        return people.stream()
                .filter(Pilot.class::isInstance)
                .map(Pilot.class::cast)
                .filter(p -> name.equals(p.getName()))
                .findFirst()
                .orElse(null);
    }

    public List<Person> getPeople() {
        return new ArrayList<>(people);
    }
}
