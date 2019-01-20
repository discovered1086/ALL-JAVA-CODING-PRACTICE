package tutorials.ioprogramming;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileOutputStream f = null;
		BufferedOutputStream b = null;
		DataOutputStream d = null;
		try{
			f = new FileOutputStream("C:\\YourText.txt");
			b = new BufferedOutputStream(f);
			d = new DataOutputStream(b);
			
			Scanner s = new Scanner(System.in);
			String line = "";
			do {
				line = s.nextLine();
			    d.writeUTF(line);
			    d.writeUTF("\n");
			    
			}while(line.trim().length()>0);
			d.flush();
		}
		catch(FileNotFoundException fx){
			fx.printStackTrace();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
