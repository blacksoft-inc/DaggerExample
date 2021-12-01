package com.blacksoft.daggerexample.dagger.models;

import javax.inject.Inject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author AbdelWadoud Rasmi
 * <p>
 * this class is a Shoes class
 */
public class Shoes {
    //
    @Getter
    @Setter
    private String brand;
    @Getter
    @Setter
    private short size;

    @Inject
    public Shoes() {
        this.brand = brand;
        this.size = size;
    }


}