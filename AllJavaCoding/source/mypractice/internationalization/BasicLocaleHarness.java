package mypractice.internationalization;

import java.util.Locale;

/** A class to practice locale related details
 * Created by CO21321 on 2/19/2018.
 */
public class BasicLocaleHarness {
    public static void main(String[] args) {
        Locale locale=Locale.getDefault();

        System.out.println("The Defaults are: country -> "+ locale.getDisplayCountry()+" and language -> "+locale.getDisplayLanguage());

        Locale.setDefault(Locale.FRANCE);

        locale=Locale.getDefault();

        System.out.println("The Defaults are: country -> "+ locale.getDisplayCountry()+" and language -> "+locale.getDisplayLanguage());
    }
}
