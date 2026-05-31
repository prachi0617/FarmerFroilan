package com.zipcodewilmington.froilansfarm.animals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;

import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crop.Corn;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

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

        Rider rider = mock(Rider.class);
        horse.beMounted(rider);

        assertTrue(horse.isMounted());
    }

    @Test
    public void horseShouldBeDismountedTest() {
        Horse horse = new Horse();

        Rider rider = mock(Rider.class);

        horse.beMounted(rider);
        horse.beDismounted(rider);

        assertFalse(horse.isMounted());
    }
}