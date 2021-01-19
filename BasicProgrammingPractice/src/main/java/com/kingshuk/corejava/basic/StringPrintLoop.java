package com.kingshuk.corejava.basic;

import java.util.Scanner;

public class StringPrintLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = scanner.nextInt();

        for (int i = 1; i <= numberOfStrings; i++) {
            String input = scanner.nextLine();

            StringBuilder evenBuilder = new StringBuilder();
            StringBuilder oddBuilder = new StringBuilder();

            for (int j = 0; j < input.length(); j++) {
                if (j % 2 == 0) {
                    evenBuilder.append(input.charAt(j));
                } else {
                    oddBuilder.append(input.charAt(j));
                }
            }

            System.out.println(evenBuilder.toString() + " " + oddBuilder.toString());
        }
    }
}
