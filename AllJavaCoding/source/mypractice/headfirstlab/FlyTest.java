package mypractice.headfirstlab;

/**
 * Created with IntelliJ IDEA.
 * User: Kingshuk
 * Date: 1/18/14
 * Time: 11:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class FlyTest {
    public static void main(String [] args){
      AirPlane biPlane=new AirPlane();
        biPlane.setSpeed(212);
        System.out.println(biPlane.getSpeed());       //This should print 212
        Jet boeing=new Jet();
        boeing.setSpeed(422);
        System.out.println(boeing.getSpeed());      //This should print 844
        int x=0;//_____________________;
        while(x<4){
            boeing.accelerate();//___________________;
            System.out.println(boeing.getSpeed());   //This should print 4 values  1688,6752
            if(boeing.getSpeed()>5000){
                biPlane.setSpeed(biPlane.getSpeed()*2);//__________________(_________________*2);
            }else{
              boeing.accelerate();//_________________________________;
            }
            x++;//___________;
        }
        System.out.print(biPlane.getSpeed());        //This should print 1696 starting from 212 and getting doubled thrice
    }
}
