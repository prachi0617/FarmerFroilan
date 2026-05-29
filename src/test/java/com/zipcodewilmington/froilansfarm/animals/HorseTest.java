package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.animal.Horse;
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

        assertTrue(horse instanceof Horse);
    }

    @Test
    public void horseShouldBeRideableTest() {
        Horse horse = new Horse();

        assertNotNull(horse);
    }
}