package com.java.optional.project.withOptional;

import com.java.optional.project.DisplayFeatures;
import com.java.optional.project.ScreenResolution;

import java.util.Optional;

public class MobileTesterWithOptional {

    public static void main(String[] args) {

        ScreenResolution resolution = new ScreenResolution(123, 12);
        DisplayFeaturesWithOptional featuresWithOptional = new DisplayFeaturesWithOptional("4.5", Optional.of(resolution));
        MobileWithOptional mobileWithOptional = new MobileWithOptional(1L, "Apple", "X", Optional.of(featuresWithOptional));
        MobileServiceWithOptional mobileServiceWithOptional = new MobileServiceWithOptional();

        int width = mobileServiceWithOptional.getMobileScreenWidth(Optional.of(mobileWithOptional));
    }
}
