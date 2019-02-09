package com.kingshuk.inputoutput.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is meant for practicing copying a file by using an input stream
 * But will use the read method that only reads one byte of data at a time
 * 
 * @author kingshuksmacbookpro
 *
 */

public class ReadFileWithFileReader {
	
	private static final Logger LOGGER = Logger.getLogger(ReadFileWithFileReader.class.getName());

	public static void main(String[] args) {
		String sourceDirectory = "resources/Roger Althoff.docx";

		String destinationDirectory = "destinationResource/Roger Althoff.docx";

		File source = new File(sourceDirectory);

		File destination = new File(destinationDirectory);

		try (FileReader fileReader = new FileReader(source);

				FileWriter fileWriter= new FileWriter(destination);

				BufferedReader bufferedReader = new BufferedReader(fileReader);
				
				BufferedWriter writer = new BufferedWriter(fileWriter)) {

					
			long timeInNano = System.currentTimeMillis()*1000;
			
			int i;
			
			while((i = bufferedReader.read())!=-1) {
				writer.write(i);
			}
			
			/**
			 * Look at a major difference here between the BufferedWriter and the 
			 * BufferedOutputStream.
			 * 
			 * The BufferedOutputStream does NOT flush automatically,
			 * where as the BufferedWriter calls the flushBuffer() method from within the
			 * read method.
			 */
			
			//System.out.println(dateFormat.format(new Date()));
			
			LOGGER.info("Total time taken: "+(System.currentTimeMillis()*1000-timeInNano)+" nano seconds");

			LOGGER.info("completed writing the data to the directory");
			
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "An error occurred while copying file" ,e);
		} 
	}

}
