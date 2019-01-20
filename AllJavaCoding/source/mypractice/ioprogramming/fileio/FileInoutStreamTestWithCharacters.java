package mypractice.ioprogramming.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by kingshuk on 11/11/17.
 */
public class FileInoutStreamTestWithCharacters {

    public static void main(String[] args) {
        //FileInputStream is a byte inout stream. It reads the stream of bytes one byte at a time.
        FileInputStream fileInputStream=null;
        Character [] characters=new Character[100000];
        try {
            fileInputStream=new FileInputStream(new File("/Volumes/Work/PROJECTS/Resources/Readme.txt"));

            int i;
            int j=0;
            //When end of the file is reached, the read method will return -1 indicating the end of the file
            while((i=fileInputStream.read())!=-1){
                //System.out.print((char)i);
                characters[j]=(char)i;
                j++;
            }
            String text= characters.toString();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileInputStream != null;
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
