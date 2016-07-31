package com.example.michael.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShoppingActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        textView = (TextView)findViewById(R.id.textView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        // TODO: allow user to choose between different categories of discounts
        // TODO: allow user to specify postcode (or suburb).
        StringBuilder str = new StringBuilder();
        str.append("Showing HEARING DISCOUNTS for CALOUNDRA\n\n");
        for (String s : DiscountsData.HEARING_DISCOUNTS) {
            str.append(s);
            str.append("\n\n");
        }
        textView.setText(str.toString());
        // TODO: make each text string a link to Google maps location.
    }
}
