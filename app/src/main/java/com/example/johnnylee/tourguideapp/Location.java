package com.example.johnnylee.tourguideapp;

/**
 * Created by johnnylee on 3/17/17.
 */

public class Location {

    private String mName;

    public String getName() {
        return mName;
    }

    private String mAddress;

    public String getAddress() {
        return mAddress;
    }

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public Location(String name, String address, int imageResourceId) {
        this.mName = name;
        this.mAddress = address;
        this.mImageResourceId = imageResourceId;
    }

    public Location(String name, String address) {
        this.mName = name;
        this.mAddress = address;
    }
}
