package com.example.renske.friendsrapp;

import android.graphics.drawable.Drawable;

/**
 * Created by Renske on 11/02/2018.
 */

public class User {

    private String name, bio;
    private int age, drawableId;
    private double rating;

    public User(String aName, String aBio, int anAge, int aDrawableId) {
        name = aName;
        bio = aBio;
        age = anAge;
        drawableId = aDrawableId;
    }


    /* Getters and setters. */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }
}
