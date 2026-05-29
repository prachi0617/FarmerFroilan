package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.Corn;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Horse;
import com.zipcodewilmington.froilansfarm.Rideable;
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
        Edible corn = new Corn();

        horse.eat(corn);

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