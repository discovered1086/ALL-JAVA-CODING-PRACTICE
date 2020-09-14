package mypractice.ioprogramming.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by kingshuk on 11/11/17.
 */
public class FileOutputStreamTest {

	public static void main(String[] args) {
		File file = new File("/Volumes/Work/PROJECTS/Resources/Applying CSS.png");

		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;

		try {
			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream("/Volumes/Work/PROJECTS/Resources/css copy.png");

			int bytes;

			while ((bytes = fileInputStream.read()) != -1) {
				fileOutputStream.write(bytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
