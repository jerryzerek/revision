package com.java.optional.project.withOptional;

import com.java.optional.project.ScreenResolution;

import java.util.Optional;

public class MobileServiceWithOptional {

    public Integer getMobileScreenWidth(Optional<MobileWithOptional> mobileWithOptional) {
        return mobileWithOptional.flatMap(MobileWithOptional::getDisplayFeaturesWithOptional)
                .flatMap(DisplayFeaturesWithOptional::getResolution)
                .map(ScreenResolution::getWidth)
                .orElse(0);
    }
}
