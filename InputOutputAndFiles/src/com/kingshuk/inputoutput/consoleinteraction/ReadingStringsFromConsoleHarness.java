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
public class ReadingStringsFromConsoleHarness {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Type anything you want, end with 'shit'....");

		String line;
		
		StringBuilder builder = new StringBuilder();

		while ((line = bufferedReader.readLine()) != null && !line.equals("shit")) {
			builder.append(line).append("\n");
		}

		bufferedReader.close();

		System.out.println(builder.toString());
	}

}
