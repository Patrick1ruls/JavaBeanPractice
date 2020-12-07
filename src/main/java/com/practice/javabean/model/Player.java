package com.practice.javabean.model;

import java.time.LocalDateTime;

public class Player implements java.io.Serializable {
    /**
     * A JavaBean is still a POJO but introduces a strict set of rules around how we implement it:
     *
     * Access levels – our properties are private and we expose getters and setters
     * Method names – our getters and setters follow the getX and setX convention (in the case of a boolean, isX can be used for a getter)
     * Default Constructor – a no-argument constructor must be present so an instance can be created without providing arguments, for example during deserialization
     * Serializable – implementing the Serializable interface allows us to store the state
     */

    // Variables (all private access levels)
    private static final long serialVersionUID = -3518535449496031136L; // Serializable
    private String name;
    private LocalDateTime dateTimeCreated;
    private int score;


    public Player() {
        // Default Constructor
    }

    public Player(String name) {
        this.name = name;
        this.dateTimeCreated = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTimeCreated() {
        return dateTimeCreated;
    }

    public void setDateTimeCreated(LocalDateTime dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }

    public int getScore() {
            return score;
        }

    public void setScore(int score) {
        this.score = score;
    }

}

