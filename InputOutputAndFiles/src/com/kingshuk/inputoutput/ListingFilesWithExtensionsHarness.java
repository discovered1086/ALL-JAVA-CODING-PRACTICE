package com.kingshuk.inputoutput;

import java.io.File;
import java.util.Objects;

public class ListingFilesWithExtensionsHarness {

    public static void main(String[] args) {
        File file = new File("/Volumes/Work/PROJECTS/CORE-JAVA-PROJECTS/InputOutputAndFiles");

        //check if the file object represents a directory or not
        System.out.println("Is this a directory? " + file.isDirectory());

        try {


            //Solution 2

            //This lists out even files inside the directory as well.
            File [] folderList=file.listFiles(file1->
                    "iml".equals(file1.getName().substring(file1.getName().indexOf(".")+1)));

            for(File folder:Objects.requireNonNull(folderList)){
                System.out.println(folder);
            }

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
