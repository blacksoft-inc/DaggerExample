package com.blacksoft.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blacksoft.daggerexample.dagger.components.DaggerPlayerComponent;
import com.blacksoft.daggerexample.dagger.components.PlayerComponent;
import com.blacksoft.daggerexample.dagger.models.Player;

import javax.inject.Inject;

/**
 * @author AbdelWadoud Rasmi
 * <p>
 * this is the only entry point of the app,
 * this project is a basic example of the usage of Dagger framework
 */
public class MainActivity extends AppCompatActivity {
    @Inject
    public Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        PlayerComponent daggerPlayerComponent = DaggerPlayerComponent.create();
        daggerPlayerComponent.inject(this);
        //
        player.plays();
    }
}