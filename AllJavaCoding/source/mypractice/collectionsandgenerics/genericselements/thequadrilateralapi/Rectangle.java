package mypractice.collectionsandgenerics.genericselements.thequadrilateralapi;

/**A class that represents rectangle
 * Created by CO21321 on 2/8/2018.
 */
public class Rectangle extends  Parallelogram{

    @Override
    public void setAllTheSides(Integer sideA, Integer sideB, Integer sideC, Integer sideD) {
        this.sideA=sideA;
    }

    @Override
    public void setAllTheAngles(Integer angleAB, Integer angleBC, Integer angleCD, Integer angleDA) {
        this.angleBC=this.angleDA=this.angleCD=this.angleAB=90;
    }
}
