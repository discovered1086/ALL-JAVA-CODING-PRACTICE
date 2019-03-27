package com.kingshuk.stringhandling;

public class SplittingStringsHarness {

    public static void main(String[] args) {
        String bigSentence="HTML Display\n" +
                "You cannot be sure how HTML will be displayed.\n" +
                "\n" +
                "Large or small screens, and resized windows will create different results.\n" +
                "\n" +
                "With HTML, you cannot change the output by adding extra spaces or " +
                "extra lines in your HTML code.";


        String [] sentences=bigSentence.split("\\.");

        for(String oneSentence: sentences){
            System.out.println(oneSentence);
        }

        String [] words=bigSentence.split(" ");

        System.out.println("\nThere are "+sentences.length +" sentences");

        System.out.println("There are "+words.length +" words");

        System.out.println("There are "+bigSentence.length()+" characters");
    }
}
