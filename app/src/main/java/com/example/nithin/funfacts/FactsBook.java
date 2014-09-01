package com.example.nithin.funfacts;

import android.app.Activity;

import java.util.Random;

/**
 * Created by nithin on 24/08/14.
 */
public class FactsBook extends Activity {
    // Member Vars
    public String[] mFacts;
    // Methods

    public String getFact() {

        String fact = "";

        Random randomGenerator = new Random(); //Contruct a new number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
     }
}


