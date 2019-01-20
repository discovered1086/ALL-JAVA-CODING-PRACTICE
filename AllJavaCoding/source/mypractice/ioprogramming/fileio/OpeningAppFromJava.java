package mypractice.ioprogramming.fileio;

import java.io.IOException;

public class OpeningAppFromJava {

    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("open /Applications/Brackets.app");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
