package mypractice.headfirstlab;

/**
 * Created with IntelliJ IDEA.
 * User: Kingshuk
 * Date: 1/18/14
 * Time: 11:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Jet extends AirPlane {
    private static final int MULTIPLIER=2;

    public Jet() {
        super();
    }

    public void setSpeed(int speed){
        super.setSpeed(speed*MULTIPLIER);
    }

    public void accelerate(){
        super.setSpeed(getSpeed()*2);
    }
}
