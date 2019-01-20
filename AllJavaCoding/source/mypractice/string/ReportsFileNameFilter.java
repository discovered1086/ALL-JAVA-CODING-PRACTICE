package mypractice.string;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created with IntelliJ IDEA.
 * User: co21321
 * Date: 4/11/16
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReportsFileNameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        boolean selectThisFile = false;
        if (name.indexOf(".") > 0) {
            int lastIndex = name.lastIndexOf('.');

            // get extension
            String str = name.substring(lastIndex);

            if (str.equalsIgnoreCase(".pdf")) {
                int index = name.toUpperCase().indexOf("CLAIM");
                if (index == 0) {
                    selectThisFile = true;
                }
            }
        }
        return selectThisFile;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
