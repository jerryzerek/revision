package com.java.optional.project.withOptional;

import java.util.Optional;

public class MobileWithOptional {

    private long id;
    private String brand;
    private String name;
    private Optional<DisplayFeaturesWithOptional> displayFeaturesWithOptional;

    public MobileWithOptional(long id, String brand, String name, Optional<DisplayFeaturesWithOptional> displayFeaturesWithOptional) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.displayFeaturesWithOptional = displayFeaturesWithOptional;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public Optional<DisplayFeaturesWithOptional> getDisplayFeaturesWithOptional() {
        return displayFeaturesWithOptional;
    }
}
