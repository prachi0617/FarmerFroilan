package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HorseTest {

    @Test
    public void horseShouldMakeNoiseTest() {
        Horse horse = new Horse();

        String actual = horse.makeNoise();

        assertEquals("Neigh", actual);
    }

    @Test
    public void horseShouldEatEdibleTest() {
        Horse horse = new Horse();
        Edible edible = new Egg();

        horse.eat(edible);

        assertTrue(horse.hasEaten());
    }

    @Test
    public void horseShouldBeRideableTest() {
        Horse horse = new Horse();

        assertTrue(horse instanceof Rideable);
    }

    @Test
    public void horseShouldBeMountedTest() {
        Horse horse = new Horse();

        horse.beMounted();

        assertTrue(horse.isMounted());
    }

    @Test
    public void horseShouldBeDismountedTest() {
        Horse horse = new Horse();

        horse.beMounted();
        horse.beDismounted();

        assertFalse(horse.isMounted());
    }
}