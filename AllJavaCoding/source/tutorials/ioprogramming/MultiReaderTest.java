package tutorials.ioprogramming;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class MultiReaderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			FileInputStream f1 = new FileInputStream("C:\\MyText.txt");
			FileInputStream f2 = new FileInputStream("C:\\YourText.txt");
			SequenceInputStream s = new SequenceInputStream(f1,f2);
			DataInputStream d1 = new DataInputStream(s);
			String line = "";
			while((line = d1.readLine())!= null){
				System.out.println(line);
			}
			s.close();
		}
		catch(FileNotFoundException fx){
			fx.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
