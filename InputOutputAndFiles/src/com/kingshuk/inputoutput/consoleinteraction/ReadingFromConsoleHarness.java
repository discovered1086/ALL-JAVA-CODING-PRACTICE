package com.kingshuk.inputoutput.consoleinteraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * This class is used for checking out the reading from console program one
 * character at a time
 * 
 * @author kimukher
 *
 */
public class ReadingFromConsoleHarness {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Type anything you want, end with 'q'....");

		Character[] arrayChar = new Character[1000];

		int index = 0;
		while ((char) bufferedReader.read() != 'q') {
			if (index < 1000) {
				arrayChar[index] = (char) bufferedReader.read();
			} else {
				break;
			}

			index++;
		}

		System.out.println(Arrays.toString(arrayChar));
	}

}
