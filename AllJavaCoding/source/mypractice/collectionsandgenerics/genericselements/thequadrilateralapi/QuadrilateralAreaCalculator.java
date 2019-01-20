package mypractice.collectionsandgenerics.genericselements.thequadrilateralapi;

/**A class that calculates area and prints the size and angles of the Quadrilateral.
 * Created by CO21321 on 2/8/2018.
 *
 * I'll assume for simplicity that the area of a trapezium is (a+b)/2 * ab
 *
 * I'll assume for simplicity that the area of a kite and rhombus is ab/2
 */
public class QuadrilateralAreaCalculator {

    public <T extends Rectangle> Integer getAreaOfRectangle(T rectangle){
        return rectangle.sideA*rectangle.sideB;
    }

    public <T extends Quadrilateral> Integer getAreaOfKiteAndRhombus(T kiteOrRhombus){
        return (kiteOrRhombus.sideA*kiteOrRhombus.sideB)/2;
    }

    public <T extends Quadrilateral> Integer getAreaOfTrapezium(T trapezium){
        return ((trapezium.sideA+trapezium.sideB)/2)*(trapezium.sideA*trapezium.sideB);
    }
}
