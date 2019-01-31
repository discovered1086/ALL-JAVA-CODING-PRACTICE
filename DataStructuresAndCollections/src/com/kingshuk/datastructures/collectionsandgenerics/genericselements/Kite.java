package com.kingshuk.datastructures.collectionsandgenerics.genericselements;

/**
 * A class representing the shape kite
 * Created by CO21321 on 2/8/2018.
 */
public class Kite extends Quadrilateral {

    public Kite() {
        this.sideA = this.sideB;
        this.sideC = this.sideD;
    }
}
