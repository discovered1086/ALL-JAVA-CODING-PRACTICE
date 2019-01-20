package com.kingshuk.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public class ListingDirectoriesHarness {

    public static void main(String[] args) {
        File file = new File("/Volumes/Work/PROJECTS/CORE-JAVA-PROJECTS/InputOutputAndFiles");

        //check if the file object represents a directory or not
        System.out.println("Is this a directory? " + file.isDirectory());

        try {

            //Solution 1
            /*Stream<Path> pathStream = Files.list(file.toPath());

            pathStream.forEach(System.out::println);*/

            //Solution 2

            //This lists out even files inside the directory as well.
            File [] folderList=file.listFiles();

            for(File folder:Objects.requireNonNull(folderList)){
                System.out.println(folder);
            }

        } /*catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
