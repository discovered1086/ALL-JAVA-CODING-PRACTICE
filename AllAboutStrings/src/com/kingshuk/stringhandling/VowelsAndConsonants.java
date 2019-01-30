package com.kingshuk.stringhandling;

public class VowelsAndConsonants {
    private static char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {
        new VowelsAndConsonants().calculateVowelsAndConsonantsAnotherWay("I am very happy today");
    }

    private void calculateVowelsAndConsonants(String inputString) {
        int vowels = 0, consonants = 0;

        String[] words = inputString.split(" ");

        for (String word : words) {
            int vowelsInTheWord = 0;
            char[] chars = word.toLowerCase().toCharArray();

            for (char char1 : chars) {
                for (char char2 : VowelsAndConsonants.vowels) {
                    if (char1 == char2) {
                        vowelsInTheWord++;
                    }
                }

            }

            consonants = consonants+word.length() - vowelsInTheWord;
            vowels = vowels + vowelsInTheWord;
        }

        System.out.println("Total number of vowels: " + vowels);
        System.out.println("Total number of consonants: " + consonants);

    }

    private void calculateVowelsAndConsonantsAnotherWay(String inputString) {
        int vowels = 0, consonants = 0;

        String vowelsInTheString="aeiou";

        inputString=(inputString.toLowerCase()).replace(" ","");

        char [] theString=(inputString).toCharArray();

        for (char c:theString){
            if(vowelsInTheString.indexOf(c)>-1){
                vowels++;
            }else
                consonants++;
        }


        System.out.println("Total number of vowels: " + vowels);
        System.out.println("Total number of consonants: " + consonants);
    }


}
