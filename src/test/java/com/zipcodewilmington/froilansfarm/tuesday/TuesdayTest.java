package com.zipcodewilmington.froilansfarm.tuesday;

import com.zipcodewilmington.froilansfarm.base.FarmTestBase;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TuesdayTest extends FarmTestBase {

    @Test
    void everyCropIsHarvestedAfterTractorRun() {
        for (CropRow cropRow : farm.getField().getCropRows()) {
            for (Crop crop : cropRow.getCrops()) {
                tractor.harvest(crop);
                assertTrue(crop.isHarvested());
            }
        }
    }

}
