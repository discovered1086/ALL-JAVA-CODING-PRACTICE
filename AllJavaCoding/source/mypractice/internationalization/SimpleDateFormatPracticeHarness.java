package mypractice.internationalization;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Simple Date format practice harness
 * Created by CO21321 on 2/20/2018.
 */
public class SimpleDateFormatPracticeHarness {
    public static void main(String[] args) throws Exception {
        System.out.println("____________________________THE FORMAT METHOD___________________________________________________\n");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss ");

        String stringDate1 = simpleDateFormat.format(new Date());

        System.out.println("The formatted date is " + stringDate1);

        System.out.println("\n____________________________THE PARSE METHOD___________________________________________________\n");

        String stringDate2="02/28/2018";

        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("MM/dd/yyyy");

        Date date = simpleDateFormat1.parse(stringDate2);

        System.out.println("The parsed date is "+simpleDateFormat1.format(date));

    }
}
