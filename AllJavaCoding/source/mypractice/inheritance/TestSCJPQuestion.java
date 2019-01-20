package mypractice.inheritance;

/**
 * Created with IntelliJ IDEA.
 * User: Kingshuk
 * Date: 1/5/14
 * Time: 12:09 AM
 * To change this template use File | Settings | File Templates.
 */

class SimpleCalc{
    public int value;
    public void calculate(){
      value+=7;
    }
}
public class TestSCJPQuestion extends SimpleCalc{
    public void calculate(){value-=3;}
    public void calculate(int multiplier){
        calculate();
        super.calculate();
        value*=multiplier;
    }

    public  static void main(String [] args){
        TestSCJPQuestion question=new TestSCJPQuestion();
        question.calculate(2);
        System.out.print("Value is "+question.value);
    }
}
