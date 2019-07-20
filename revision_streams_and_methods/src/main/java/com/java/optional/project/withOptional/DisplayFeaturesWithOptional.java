package com.java.optional.project.withOptional;

import com.java.optional.project.ScreenResolution;

import java.util.Optional;

public class DisplayFeaturesWithOptional {

    private String size;
    Optional<ScreenResolution> resolution;

    public DisplayFeaturesWithOptional(String size, Optional<ScreenResolution> resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    public String getSize() {
        return size;
    }

    public Optional<ScreenResolution> getResolution() {
        return resolution;
    }
}
