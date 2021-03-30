package com.example.weatherreport3;

public class Upload {
    private String mName;
    private String mImageUrl;
    private String mPlace;
    private String mYourName;

    public Upload() {
        // empty constructor needed
    }

    public Upload(String name, String imageUrl, String place, String yourName) {
        if (name.trim().equals("")) {
            name = "No Name";
        }

        mName = name;
        mImageUrl = imageUrl;
        mPlace = place;
        mYourName = yourName;
    }

    public String getName() {
        return mName;
    }
    public void setName(String name) {
        mName = name;
    }

    public String getmImageUrl() { return mImageUrl; }
    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getPlace() { return mPlace; }
    public void setPlace(String place) { mPlace = place; }

    public String getYourName() { return mYourName; }
    public void setYourName(String yourName) { mYourName = yourName; }
}
