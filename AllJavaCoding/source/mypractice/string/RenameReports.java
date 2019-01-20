package mypractice.string;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: co21321
 * Date: 4/11/16
 * Time: 1:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class RenameReports {

    public static void main(String[] args) throws Exception {

        String directoryName = "C:\\Project\\Java practice\\";

        File directory = new File(directoryName);

        File[] fileList = directory.listFiles(new ReportsFileNameFilter());

        new RenameReports().detectAndRenameFile(fileList, directoryName);

    }

    private void detectAndRenameFile(File[] fileList, String directoryName) {
        StringBuffer newName = null;
        int i = 0;
        for (File file : fileList) {
            newName = new StringBuffer(256);
            if (file.getName().toUpperCase().indexOf("VAC") > 0) {
                i = file.getName().toUpperCase().indexOf("VAC");
            } else if (file.getName().toUpperCase().indexOf("VCI") > 0) {
                i = file.getName().toUpperCase().indexOf("VCI");
            }
            String afterUnderscore = file.getName().substring(i);
            if (file.getName().toUpperCase().indexOf("DETAIL") > 0) {
                newName.append("ClaimDetail").append("_").append(afterUnderscore);
            } else if (file.getName().toUpperCase().indexOf("TIME") > 0) {
                newName.append("ClaimTimeline").append("_").append(afterUnderscore);
            }

            File renamedFile = new File(directoryName + newName.toString());
            boolean isFileRenamed = file.renameTo(renamedFile);

            if (isFileRenamed)
                System.out.println("File has been renamed");
            else
                System.out.println("Error renaming the file");

            file = null;
            renamedFile = null;

        }
    }
}
