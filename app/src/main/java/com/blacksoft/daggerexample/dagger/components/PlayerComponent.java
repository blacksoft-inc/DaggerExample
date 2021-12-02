package com.blacksoft.daggerexample.dagger.components;

import com.blacksoft.daggerexample.MainActivity;
import com.blacksoft.daggerexample.dagger.Modules.AdidasModule;
import com.blacksoft.daggerexample.dagger.Modules.OutfitModule;
import com.blacksoft.daggerexample.dagger.Modules.NikeModule;
import com.blacksoft.daggerexample.dagger.models.Player;
import com.blacksoft.daggerexample.dagger.models.Shoes.AdidasShoes;

import dagger.Component;

/**
 * @author AbdelWadoud Rasmi
 * <p>
 * this class is a player class which represents a football player
 */
@Component(modules = {OutfitModule.class, NikeModule.class, AdidasModule.class})
public interface PlayerComponent {

    Player getPlayer();

    void inject(MainActivity mainActivity);
}
