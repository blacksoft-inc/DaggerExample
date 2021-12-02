package com.blacksoft.daggerexample.dagger.components;

import com.blacksoft.daggerexample.MainActivity;
import com.blacksoft.daggerexample.dagger.Modules.OutfitModule;
import com.blacksoft.daggerexample.dagger.models.Player;

import dagger.Component;
import dagger.Module;

/**
 * @author AbdelWadoud Rasmi
 * <p>
 * this class is a player class which represents a football player
 */
@Component(modules = {OutfitModule.class})
public interface PlayerComponent {

    Player getPlayer();

    void inject(MainActivity mainActivity);
}
