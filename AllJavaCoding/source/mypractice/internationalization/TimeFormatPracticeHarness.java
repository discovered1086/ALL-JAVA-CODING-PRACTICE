package mypractice.internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**A class for practicing the date formats
 * Created by CO21321 on 2/20/2018.
 */
public class TimeFormatPracticeHarness {
    public static void main(String[] args) {

        Date date=new Date();

        System.out.println("______________________________FULL FORMAT________________________________________________________\n");

        System.out.println("The time in default format is "+DateFormat.getTimeInstance(DateFormat.FULL).format(date));

        System.out.println("The date in UK format is "+DateFormat.getTimeInstance(DateFormat.FULL, Locale.UK).format(date));

        System.out.println("The date in FRANCE format is "+DateFormat.getTimeInstance(DateFormat.FULL, Locale.FRANCE).format(date));

        System.out.println("\n______________________________LONG FORMAT________________________________________________________\n");

        System.out.println("The date in default format is "+DateFormat.getTimeInstance(DateFormat.LONG).format(date));

        System.out.println("The date in UK format is "+DateFormat.getTimeInstance(DateFormat.LONG, Locale.UK).format(date));

        System.out.println("The date in FRANCE format is "+DateFormat.getTimeInstance(DateFormat.LONG, Locale.FRANCE).format(date));

        System.out.println("\n______________________________MEDIUM FORMAT________________________________________________________\n");

        System.out.println("The date in default format is " + DateFormat.getTimeInstance(DateFormat.MEDIUM).format(date));

        System.out.println("The date in UK format is "+DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.UK).format(date));

        System.out.println("The date in FRANCE format is "+DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.FRANCE).format(date));

        System.out.println("\n______________________________SHORT FORMAT________________________________________________________\n");

        System.out.println("The date in default format is " + DateFormat.getTimeInstance(DateFormat.SHORT).format(date));

        System.out.println("The date in UK format is "+DateFormat.getTimeInstance(DateFormat.SHORT, Locale.UK).format(date));

        System.out.println("The date in FRANCE format is "+DateFormat.getTimeInstance(DateFormat.SHORT, Locale.FRANCE).format(date));
    }
}
