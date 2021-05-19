package com.kingshuk.corejava.privatemethods;

import java.math.BigInteger;

public interface ICalculateSum {

    default BigInteger calculateSum(int a, int b) {
        return sum(a, b);
    }

    private BigInteger sum(int a, int b) {
        final BigInteger number1 = new BigInteger(String.valueOf(a));
        final BigInteger number2 = new BigInteger(String.valueOf(b));
        return number1.add(number2);
    }


}
