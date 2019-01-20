package mypractice.collectionsandgenerics.genericselements.thequadrilateralapi;

/**
 * A parent class to all the quadrilaterals
 * Created by CO21321 on 2/8/2018.
 */
public abstract class Quadrilateral {

    protected Integer sideA;

    protected Integer sideB;

    protected Integer sideC;

    protected Integer sideD;

    protected Integer angleAB;

    protected Integer angleBC;

    protected Integer angleCD;

    protected Integer angleDA;

    public Integer getSideA() {
        return sideA;
    }

    public Integer getSideB() {
        return sideB;
    }

    public Integer getSideC() {
        return sideC;
    }

    public Integer getSideD() {
        return sideD;
    }

    public Integer getAngleAB() {
        return angleAB;
    }

    public Integer getAngleBC() {
        return angleBC;
    }

    public Integer getAngleCD() {
        return angleCD;
    }

    public Integer getAngleDA() {
        return angleDA;
    }

    public abstract void setAllTheSides(Integer sideA, Integer sideB, Integer sideC, Integer sideD);

    public abstract void setAllTheAngles(Integer angleAB, Integer angleBC, Integer angleCD, Integer angleDA);
}
