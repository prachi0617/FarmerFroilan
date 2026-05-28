package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Crop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CropTest {

    @Test
    public void cropShouldExistTest() {
        Crop crop = new Crop(false);

        assertNotNull(crop);
    }

    @Test
    public void cropShouldHaveFertilizedStatusTest() {
        Crop crop = new Crop(true);

        assertTrue(crop.hasBeenFertilized());
    }

    @Test
    public void cropShouldNotBeFertilizedByDefaultTest() {
        Crop crop = new Crop(false);

        assertFalse(crop.hasBeenFertilized());
    }
}