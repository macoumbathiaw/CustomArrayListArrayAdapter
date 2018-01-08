package com.macoumbathiaw.mthiaw.customarraylistarrayadapter;

/**
 * Created by mthiaw on 1/7/18.
 */

public class CustomWords {

    //Declare the variables
    private String mWolof;
    private String mEnglish;
    private int mImage;

    //Create a default constructor without any variable
    public CustomWords() {
    }

    //Create a default constructor with 2 variables
    public CustomWords(String mWolof, String mEnglish) {
        this.mWolof = mWolof;
        this.mEnglish = mEnglish;
    }

    //Create a default constructor with 3 variables
    public CustomWords(String mWolof, String mEnglish, int mImage) {
        this.mWolof = mWolof;
        this.mEnglish = mEnglish;
        this.mImage = mImage;
    }

    //Get the wolof word
    public String getmWolof() {
        return mWolof;
    }

    //Get the English word
    public String getmEnglish() {
        return mEnglish;
    }

    //Get the image
    public int getmImage() {
        return mImage;
    }
}
