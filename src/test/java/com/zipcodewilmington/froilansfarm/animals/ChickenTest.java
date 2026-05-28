package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.Chicken;
import com.zipcodewilmington.froilansfarm.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChickenTest {

    @Test
    public void chickenShouldMakeNoiseTest() {
        Chicken chicken = new Chicken();

        String actual = chicken.makeNoise();

        assertEquals("Cluck", actual);
    }

    @Test
    public void chickenShouldYieldEggWhenNotFertilizedTest() {
        Chicken chicken = new Chicken(false);

        Edible edible = chicken.yield();

        assertNotNull(edible);
    }

    @Test
    public void chickenShouldNotYieldEggWhenFertilizedTest() {
        Chicken chicken = new Chicken(true);

        Edible edible = chicken.yield();

        assertNull(edible);
    }
}