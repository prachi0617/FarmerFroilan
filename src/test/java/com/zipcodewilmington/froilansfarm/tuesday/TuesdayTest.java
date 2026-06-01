package com.zipcodewilmington.froilansfarm.tuesday;

import com.zipcodewilmington.froilansfarm.base.FarmTestBase;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TuesdayTest extends FarmTestBase {

    @Test
    void everyCropIsHarvestedAfterTractorRun() {
        cornRow.add(new com.zipcodewilmington.froilansfarm.crop.CornStalk(false, false));
        tomatoRow.add(new com.zipcodewilmington.froilansfarm.crop.TomatoPlant(false, false));

        for (CropRow<? extends Crop> cropRow : farm.getField().getCropRows()) {
            for (Crop crop : cropRow.getCrops()) {
                tractor.harvest(crop);
                assertTrue(crop.isHarvested());
            }
        }
    }

}
