/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.butterfly;

import java.util.Random;

/**
 *
 * @author garci
 */
public class rules {

    private String colonyName;
    private String caretaker;
    private String colonyColor;
    private int colonyNum;
    private String colorAdd;
    private boolean vitamin;
    private int startSize;
    private int Breed;
    private int Feed;

    

    public void setNameColony(String colonyName) {
        this.colonyName = colonyName;
    }

    public String getNameColony() {
        return colonyName;
    }

    public void setCaretakerName(String caretakerName) {
        this.caretaker = caretakerName;
    }

    public String getCaretakerName() {
        return caretaker;
    }

    public void setColonyColor(String colonyColor) {
        this.colonyColor = colonyColor;
    }

    public void setColonyNum(int startsize) {
        this.colonyNum = startsize;
    }

    public int getColonyNum() {
        return colonyNum;
    }

    public String getColonyColor() {
        return colonyColor;
    }

    public void colorAdd(String newColor) {
        this.colorAdd = newColor;

    }

    public String getColorAdd() {
        return colorAdd;

    }

    public void setBreed(int newBreed) {
        this.Breed = newBreed;
    }

    public int getBreed() {
        return Breed;
    }

    public void setFeed(int newFeed) {
        this.Feed = newFeed;
    }

    public int getFeed() {
        return Feed;
    }

    public void setVitamin(boolean newVitamin) {
        this.vitamin = newVitamin;
    }

    public void setStartingSize(int startsize) {
        this.startSize = startsize;
    }

    public int getStartingSize() {
        return startSize;
    }

    public void sick() {
        Random r = new Random();
        if (vitamin == true) {
            int x = r.nextInt(5) ;
            
            passAway(x);
        } else {
            int y = r.nextInt(4) ;
            
            passAway(y);
        }
    }

    public void passAway(int dieChance) {
        if (dieChance == 2) {
            colonyNum = colonyNum - (colonyNum / 10);

        }

    }

    public void breedCal() {
        if (Breed >= Feed) {
            colonyNum = (int) Math.pow(2, Feed) * colonyNum;

        } else {
            colonyNum = (int) Math.pow(2, Breed) * colonyNum;
        }
    }
}
