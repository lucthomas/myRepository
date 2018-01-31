package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView firstMenuItem = (TextView) findViewById(R.id.menu_item_1);
        String firstText = (String)firstMenuItem.getText();
        Log.i("MainActivity",firstText);
        //Log.i is a method which sends a text to the logcat info level
        //i(String, String) stands for information level (level of importance of log) and
        //the first String input is for the class name, while the second one is for the log message
        //Log.v would be a method which sends a text to the logcat verbose level

        // Find second menu item TextView and print the text to the logs
        TextView secondMenuItem = (TextView) findViewById(R.id.menu_item_2);
        String secondText = (String)secondMenuItem.getText();
        Log.i("MainActivity",secondText);

        // Find third menu item TextView and print the text to the logs
        TextView thirdMenuItem = (TextView) findViewById(R.id.menu_item_3);
        String thirdText = thirdMenuItem.getText().toString();
        //the toString() factor method allows to convert getText from CharSequence to String.
        Log.i("MainActivity",thirdText);
    }
}