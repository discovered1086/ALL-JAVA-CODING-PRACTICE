package mypractice.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

/**A class to come up with solution for Bharath's assignments
 * Created by CO21321 on 2/20/2018.
 */
public class NumberFormatAssignmentHarness {
    public static void main(String[] args) {

        Long number= 454545568865456L;

        NumberFormat format=NumberFormat.getNumberInstance(Locale.UK);

        System.out.println("The number in UK format would be "+format.format(number));

        format=NumberFormat.getNumberInstance(Locale.US);

        System.out.println("The number in US format would be "+format.format(number));
    }
}
