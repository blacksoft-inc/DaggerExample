package com.blacksoft.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * @author AbdelWadoud Rasmi
 * <p>
 * this is the only entry point of the app,
 * this project is a basic example of the usage of Dagger framework
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}