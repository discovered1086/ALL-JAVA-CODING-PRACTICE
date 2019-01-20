package mypractice.collectionsandgenerics.genericselements.thequadrilateralapi;

/**
 * A class representing the shape kite
 * Created by CO21321 on 2/8/2018.
 */
public class Kite extends Quadrilateral {

    @Override
    public void setAllTheSides(Integer sideA, Integer sideB, Integer sideC, Integer sideD) {
        this.sideA = sideB;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    @Override
    public void setAllTheAngles(Integer angleAB, Integer angleBC, Integer angleCD, Integer angleDA) {
        this.angleAB = angleAB;
        this.angleBC = angleBC;
        this.angleCD = angleCD;
        this.angleDA = angleDA;
    }
}
