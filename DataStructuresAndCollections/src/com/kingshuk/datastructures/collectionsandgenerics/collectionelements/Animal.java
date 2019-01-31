package com.kingshuk.datastructures.collectionsandgenerics.collectionelements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Kingshuk
 * Date: 10/9/12
 * Time: 11:45 AM
 * To change this template use File | Settings | File Templates.
 */
public  class Animal {
    private String colour;
    private List<String> foodlist=new ArrayList<String>();
    private String spieces;
    private String type;

    public Animal(String colour, List<String> foodlist, String spieces, String type) {
        this.colour = colour;
        this.foodlist = foodlist;
        this.spieces = spieces;
        this.type = type;
    }

    public Animal() {
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public List<String> getFoodlist() {
        return foodlist;
    }

    public void setFoodlist(List<String> foodlist) {
        this.foodlist = foodlist;
    }

    public String getSpieces() {
        return spieces;
    }

    public void setSpieces(String spieces) {
        this.spieces = spieces;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
