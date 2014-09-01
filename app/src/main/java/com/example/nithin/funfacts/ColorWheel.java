package com.example.nithin.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by nithin on 24/08/14.
 */
public class ColorWheel {

    // Member vars
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    // Methods

    public int getColor(){

        String color = "";

        Random randomGenerator = new Random(); //Contruct a new number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int ColorAsInt = Color.parseColor(color);

        return ColorAsInt;
    }
}
