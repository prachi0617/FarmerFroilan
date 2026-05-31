package com.zipcodewilmington.froilansfarm.monday;

import com.zipcodewilmington.froilansfarm.base.FarmTestBase;
import com.zipcodewilmington.froilansfarm.crop.ArbitraryCrop;
import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MondayTest extends FarmTestBase {

    @Test
    void cropDusterCanFlyOverField() {
        froilanda.fly();
    }
    
    @Test
    void everyCropRowIsFertilizedAfterCropDusterPass() {

        cropRow1.addCrop(new CornStalk());
        cropRow2.addCrop(new TomatoPlant());
        cropRow3.addCrop(new ArbitraryCrop());

        for (CropRow<?> cropRow : farm.getField().getCropRows()) {
        cropDuster.fertilize(cropRow);
        }

        for (CropRow<?> cropRow : farm.getField().getCropRows()) {
            for (Crop crop : cropRow.getCrops()) {
                assertTrue(crop.hasBeenFertilized());
            }
        }
    }

}
