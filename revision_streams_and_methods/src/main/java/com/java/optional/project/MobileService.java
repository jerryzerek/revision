package com.java.optional.project;

public class MobileService {

    public int getMobileScreenWidth(Mobile mobile) {

        if (mobile !=null) {
            DisplayFeatures features = mobile.getDisplayFeatures();
            if (features != null) {
                ScreenResolution resolution = features.getResolution();
                if (resolution != null) {
                    return resolution.getWidth();
                }
            }
        }
        return 0;
    }
}
