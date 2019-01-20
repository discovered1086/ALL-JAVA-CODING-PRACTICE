package mypractice.collectionsandgenerics.genericselements;

/** A class that represents all parallelograms
 * Created by CO21321 on 2/8/2018.
 */
public abstract class Parallelogram extends Quadrilateral {

    public Parallelogram() {
        this.sideA=this.sideC;
        this.sideB=this.sideD;
        this.angleAB=this.angleCD;
        this.angleBC=this.angleDA;
    }
}
