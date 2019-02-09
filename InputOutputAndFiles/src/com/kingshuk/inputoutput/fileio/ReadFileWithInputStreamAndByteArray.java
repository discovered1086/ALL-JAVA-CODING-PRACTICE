package com.kingshuk.inputoutput.fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This class is meant for practicing copying a file by using an input stream
 * And we'll use read method that reads an array of bytes at a time
 * 
 * @author kingshuksmacbookpro
 *
 */

public class ReadFileWithInputStreamAndByteArray {

	public static void main(String[] args) {
		String sourceDirectory = "resources/Picture.png";

		String destinationDirectory = "destinationResource/profile-picture.png";

		File source = new File(sourceDirectory);

		File destination = new File(destinationDirectory);

		try (FileInputStream fileInputStream = new FileInputStream(source);

				FileOutputStream outputStream = new FileOutputStream(destination);

				BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

				BufferedOutputStream bOutputStream = new BufferedOutputStream(outputStream);) {

			byte[] byteArray = new byte[100];

			/*
			 * We'll be reading the size of the byte array at a time
			 */

			long timeInNano = System.currentTimeMillis() * 1000;

			while (bufferedInputStream.read(byteArray) != -1) {
				bOutputStream.write(byteArray);
			}

			bOutputStream.flush();

			System.out
					.println("Total time taken: " + (System.currentTimeMillis() * 1000 - timeInNano) + " nano seconds");

			System.out.println("completed writing the data to the directory");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
