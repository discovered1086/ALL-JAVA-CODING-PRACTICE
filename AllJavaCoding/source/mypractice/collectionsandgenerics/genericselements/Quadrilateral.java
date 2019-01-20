package mypractice.collectionsandgenerics.genericselements;

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

    public void setSideA(Integer sideA) {
        this.sideA = sideA;
    }

    public Integer getSideB() {
        return sideB;
    }

    public void setSideB(Integer sideB) {
        this.sideB = sideB;
    }

    public Integer getSideC() {
        return sideC;
    }

    public void setSideC(Integer sideC) {
        this.sideC = sideC;
    }

    public Integer getSideD() {
        return sideD;
    }

    public void setSideD(Integer sideD) {
        this.sideD = sideD;
    }

    public Integer getAngleAB() {
        return angleAB;
    }

    public void setAngleAB(Integer angleAB) {
        this.angleAB = angleAB;
    }

    public Integer getAngleBC() {
        return angleBC;
    }

    public void setAngleBC(Integer angleBC) {
        this.angleBC = angleBC;
    }

    public Integer getAngleCD() {
        return angleCD;
    }

    public void setAngleCD(Integer angleCD) {
        this.angleCD = angleCD;
    }

    public Integer getAngleDA() {
        return angleDA;
    }

    public void setAngleDA(Integer angleDA) {
        this.angleDA = angleDA;
    }
}
