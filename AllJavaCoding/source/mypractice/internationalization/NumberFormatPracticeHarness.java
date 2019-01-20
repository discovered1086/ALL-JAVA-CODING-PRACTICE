package mypractice.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

/** A class for practicing Internationalization from a number format perspective
 * Created by CO21321 on 2/20/2018.
 */
public class NumberFormatPracticeHarness {
    public static void main(String[] args) {

        Double moneyPaid=458689.2565465;

        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.UK);

        NumberFormat format=NumberFormat.getNumberInstance(Locale.US);

        System.out.println("The money paid in US dollars is: "+ currencyInstance.format(moneyPaid));

        System.out.println("The number is : "+ format.format(moneyPaid));

        /**
         * The output of this program is
         *
         * The number is : 458,689.257
         *
         * Notice how the digits after the fraction has automatically been truncated to 3 digits. This can be controlled
         */

        format.setMinimumFractionDigits(2);

        /**
         * If minimum < default (which is 3) then of course it's going to display the default because we said minimum
         */

        System.out.println("The number is (After controlling minimum number of digits after the decimal) : "+ format.format(moneyPaid));

        format.setMaximumFractionDigits(3);


        System.out.println("The number is (After controlling maximum number of digits after the decimal) : "+ format.format(5456456.5464564654));

        format.setMinimumIntegerDigits(4);

        System.out.println("The number is (After controlling minimum number of digits before the decimal) : "+ format.format(moneyPaid));

        format.setMaximumIntegerDigits(2);

        System.out.println("The number is (After controlling maximum number of digits before the decimal) : "+ format.format(moneyPaid));

    }
}
