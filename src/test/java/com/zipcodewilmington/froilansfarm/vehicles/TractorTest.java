package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.base.FarmTestBase;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class TractorTest extends FarmTestBase {

    @Test
    void tractorCanOperate() {
        tractor.operate(farm);

        assertTrue(tractor.isOperating());
    }

    @Test
    void tractorShouldHarvestCropTest() {
        Tractor tractor = new Tractor();

        Crop<?> crop = mock(Crop.class);

        tractor.harvest(crop);

        verify(crop).harvest();
    }

    @Test
    void cropIsHarvestedAfterTractorHarvests() {
        Tractor tractor = new Tractor();

        CornStalk crop = new CornStalk();

        tractor.harvest(crop);

        assertTrue(crop.isHarvested());
    }

    // EDGE CASES
     @Test
    void tractorMakesNoise() {
        assertEquals("Vroom", tractor.makeNoise());
    }
    
    //ALREADY HARVESTED CROP
    @Test
    void harvestingAlreadyHarvestedCropDoesNothing() {
        CornStalk crop = new CornStalk();

        tractor.harvest(crop);

        tractor.harvest(crop);

        assertTrue(crop.isHarvested());
    }

    //NULL CROP
    @Test
    void harvestingNullCropThrowsException() {
        assertThrows(
            IllegalArgumentException.class,
            () -> tractor.harvest(null)
        );
    }

    //GENERIC POLYMORPHISM TEST
    @Test
    void tractorCanHarvestCornAndTomatoes() {
        CornStalk corn = new CornStalk();
        TomatoPlant tomato = new TomatoPlant();

        tractor.harvest(corn);
        tractor.harvest(tomato);

        assertTrue(corn.isHarvested());
        assertTrue(tomato.isHarvested());
    }

    //INTEGRATION TEST
    @Test
    void froilanHarvestsEntireFieldOnTuesday() {

        Field field = farm.getField();

        assertFalse(field.getRows().isEmpty());

        tractor.harvestField(field);

        for (CropRow<?> row : field.getRows()) {

            assertFalse(row.getCrops().isEmpty());

            for (Crop<?> crop : row.getCrops()) {
                assertTrue(crop.isHarvested());
            }
        }
    }

}
