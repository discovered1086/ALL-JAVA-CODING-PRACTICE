package mypractice.ioprogramming.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by kingshuk on 11/11/17.
 */
public class FileInputStreamTest {

	public static void main(String[] args) {
		// FileInputStream is a byte inout stream. It reads the stream of bytes one byte
		// at a time.
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(new File("/Volumes/Work/PROJECTS/Resources/Readme.txt"));

			int i;
			// When end of the file is reached, the read method will return -1 indicating
			// the end of the file
			while ((i = fileInputStream.read()) != -1) {
				System.out.print((char) i);
			}
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
