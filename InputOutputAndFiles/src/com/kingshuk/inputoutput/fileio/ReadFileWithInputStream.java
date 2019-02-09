package com.kingshuk.inputoutput.fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * This class is meant for practicing copying a file by using an input stream
 * But will use the read method that only reads one byte of data at a time
 * 
 * @author kingshuksmacbookpro
 *
 */

public class ReadFileWithInputStream {

	public static void main(String[] args) {
		String sourceDirectory = "resources/Roger Althoff.docx";

		String destinationDirectory = "destinationResource/Roger Althoff.docx";

		File source = new File(sourceDirectory);

		File destination = new File(destinationDirectory);

		try (FileInputStream fileInputStream = new FileInputStream(source);

				FileOutputStream outputStream = new FileOutputStream(destination);

				BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

				BufferedOutputStream bOutputStream = new BufferedOutputStream(outputStream);) {

			int i;
			
			//SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
			//System.out.println(dateFormat.format(new Date()));
			
			long timeInNano = System.currentTimeMillis()*1000;
			//System.out.println(timeInNano);

			while ((i = bufferedInputStream.read()) != -1) {
				bOutputStream.write(i);
			}

			bOutputStream.flush();
			
			//System.out.println(dateFormat.format(new Date()));
			System.out.println("Total time taken: "+(System.currentTimeMillis()*1000-timeInNano)+" nano seconds");

			System.out.println("completed writing the data to the directory");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
