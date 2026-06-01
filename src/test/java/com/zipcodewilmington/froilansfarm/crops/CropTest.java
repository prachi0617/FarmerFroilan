package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CropTest {

    @Test
    void cropCanBeFertilized() {
        Crop crop = new CornStalk(false, false);
        crop.fertilize();
        assertTrue(crop.hasBeenFertilized());
    }

    @Test
    void cropStartsUnfertilized() {
        Crop crop = new CornStalk(false, false);
        assertFalse(crop.hasBeenFertilized());
    }

    @Test
    void cropStartsUnharvested() {
        Crop crop = new CornStalk(false, false);
        assertFalse(crop.hasBeenHarvested());
    }

    @Test
    void cropCanBeHarvested() {
        Crop crop = new CornStalk(false, false);
        crop.harvest();
        assertTrue(crop.hasBeenHarvested());
    }

    @Test
    void unfertilizedCropDoesNotYield() {
        Crop crop = new CornStalk(false, false);
        Edible result = crop.yield();
        assertNull(result);
    }
}