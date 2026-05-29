package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CropTest {

    @Test
    public void cropCanBeFertilizedTest() {
        Crop crop = new CornStalk(false);

        crop.fertilize();

        assertTrue(crop.hasBeenFertilized());
    }

    @Test
    public void cropStartsUnfertilizedTest() {
        Crop crop = new CornStalk(false);

        assertFalse(crop.hasBeenFertilized());
    }

    @Test
    public void cropStartsUnharvestedTest() {
        Crop crop = new CornStalk(false);

        assertFalse(crop.hasBeenHarvested());
    }

    @Test
    public void cropCanBeHarvestedTest() {
        Crop crop = new CornStalk(false);

        crop.harvest();

        assertTrue(crop.hasBeenHarvested());
    }

    @Test
    public void unfertilizedCropDoesNotYieldTest() {
        Crop crop = new CornStalk(false);

        Edible result = crop.yield();

        assertNull(result);
    }
}