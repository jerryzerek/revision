package com.java.optional.project;

public class MobileTesterWithoutOptional {
    public static void main(String[] args) {
        ScreenResolution resolution = new ScreenResolution(72, 122);
        DisplayFeatures features = new DisplayFeatures("4,7", resolution);
        Mobile mobile = new Mobile(1L, "Samsung", "S8", features);

        MobileService mobileService = new MobileService();

        int mobileWidth = mobileService.getMobileScreenWidth(mobile);
        System.out.println("Samsung S8 has width of " + mobileWidth);
    }
}
