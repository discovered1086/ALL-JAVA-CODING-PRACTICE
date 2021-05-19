package com.kingshuk.corejava.privatemethods;


public class PrivateMethodDemo {
    public static void main(String[] args) {
        ICalculateSum calculateSum = new CalculateSumImpl();
        System.out.println("The sum is: "+ calculateSum.calculateSum(548784, 16454));

        System.out.println("The second sum is: "+
                ICalculateSumStatic.calculateSum(548784, 16454));
    }
}
