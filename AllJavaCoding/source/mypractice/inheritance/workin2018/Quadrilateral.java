package mypractice.inheritance.workin2018;

public class Quadrilateral {

    private Integer sideA;

    private Integer sideB;

    public Quadrilateral() {
        System.out.println("The memory location is this Quadrilateral object is " +this);
        System.out.println("And the hashCode of this Quadrilateral object is "+this.hashCode());
    }

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
}
