package tutorials.ioprogramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileOutputStream f1 = null;
		FileInputStream f2 = null;
		DataInputStream d1 = null;
		DataOutputStream d2 = null;
		try{
			f2 = new FileInputStream("C:\\YourText.txt");
			d1 = new DataInputStream(f2);
			f1 = new FileOutputStream ("C:\\MyText.txt");
			d2 = new DataOutputStream(f1);
			String line = "";
			while((line = d1.readLine()) != null)
			{
				d2.writeUTF(line);
				d2.writeUTF("\n");
				d2.flush();
			}
		}
		catch(FileNotFoundException fx) 
		{
			fx.printStackTrace();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
