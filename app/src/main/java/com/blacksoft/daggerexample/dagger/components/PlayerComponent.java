package com.blacksoft.daggerexample.dagger.components;

import com.blacksoft.daggerexample.dagger.models.Player;

import dagger.Component;

/**
 * @author AbdelWadoud Rasmi
 * <p>
 * this class is a player class which represents a football player
 */
@Component
public interface PlayerComponent {

    Player getPlayer();
}
