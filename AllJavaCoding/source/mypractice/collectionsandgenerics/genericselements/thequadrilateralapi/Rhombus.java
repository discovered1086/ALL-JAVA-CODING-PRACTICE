package mypractice.collectionsandgenerics.genericselements.thequadrilateralapi;

/**A class representing Rhombus
 * Created by CO21321 on 2/8/2018.
 */
public class Rhombus extends Parallelogram {//implements KiteAndRhombusAreaEntity{

    public Rhombus() {
        this.sideA=this.sideB=this.sideC=this.sideD;
    }

    @Override
    public void setAllTheSides(Integer sideA, Integer sideB, Integer sideC, Integer sideD) {

    }

    @Override
    public void setAllTheAngles(Integer angleAB, Integer angleBC, Integer angleCD, Integer angleDA) {

    }
}
