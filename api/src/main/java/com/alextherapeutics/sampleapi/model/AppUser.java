package com.alextherapeutics.sampleapi.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * A user in the App
 */
@Entity
@Data
public class AppUser extends BasicEntity {
    @Column
    private String email;
    @Column
    private int age;
    /**
     * How many cigarettes the user is smoking daily when starting in the app
     */
    @Column
    private int numberCigarettesSmoked;
}
