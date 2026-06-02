package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import java.util.ArrayList;
import java.util.List;

public class Field {

    private final List<CropRow<? extends Crop<?>>> rows = new ArrayList<>();

    public <T extends Crop<?>> void addRow(CropRow<T> row) {
        if (row != null) {
            rows.add(row);
        }
    }

    public List<CropRow<? extends Crop<?>>> getRows() {
        return new ArrayList<>(rows);
    }

    public List<CropRow<? extends Crop<?>>> getCropRows() {
        return getRows();
    }
}
