package mypractice.ioprogramming.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by kingshuk on 11/12/17.
 */
public class BufferedReaderTest {

    public static void main(String[] args) {

        try(FileReader fileReader=new FileReader("/Volumes/Work/PROJECTS/Resources/Readme.txt");
                BufferedReader bufferedReader=new BufferedReader(fileReader)){

            String line;
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
