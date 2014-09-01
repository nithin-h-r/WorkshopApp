package com.example.nithin.funfacts;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_main_view_of_facts);


        Button startButton = (Button)findViewById(R.id.startButton);
        final RelativeLayout mainRelativeLayout = (RelativeLayout) findViewById(R.id.mainRelativeLayout);

        /*ColorWheel mColorWheel = new ColorWheel();

        int color = mColorWheel.getColor();
        mainRelativeLayout.setBackgroundColor(color);
        startButton.setTextColor(color);*/

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                setContentView(R.layout.activity_fun_facts);
                final TextView factLabel = (TextView) findViewById(R.id.factTextView);
                final Button showFactButton = (Button) findViewById(R.id.showFactButton);
                final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

                View.OnClickListener newListner = new View.OnClickListener() {
                    public void onClick(View view) {

                        FactsBook mFactBook = new FactsBook();
                        ColorWheel mColorWheel = new ColorWheel();

                        Resources resources = getResources();
                        mFactBook.mFacts = resources.getStringArray(R.array.funFacts);


                        String fact = mFactBook.getFact();
                        factLabel.setText(fact);

                        int color = mColorWheel.getColor();
                        relativeLayout.setBackgroundColor(color);
                        showFactButton.setTextColor(color);

                    }
                };
                factLabel.setOnClickListener(newListner);

            }
        };
        startButton.setOnClickListener(listener);
    }
}