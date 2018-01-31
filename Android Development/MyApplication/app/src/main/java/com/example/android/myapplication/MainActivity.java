package com.example.android.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//By extending with AppCompatActivity we allow ourselves to use methods such as SetContentView
//and ViewFindById which don't need to be defined in the MainActivity class then since they
//are already defined in the AppCompatActivity superclass.
//We actually do class inheritance. It is important to understand that AppCompatActivity has methods
//that can be used for different subclasses like MainActivity in this case.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //We use the onCreate method here from AppCompatActivity which we override with new code
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        //this: stands for the current activity within this class, it is a context
        textView.setText("Amazing!");
        textView.setTextColor(Color.RED);
        textView.setTextSize(10);
        textView.setAllCaps(false);
        textView.setVisibility(View.VISIBLE);
//int visibility could be View.VISIBLE, View.INVISIBLE or View.GONE
        setContentView(textView);
    }
}
