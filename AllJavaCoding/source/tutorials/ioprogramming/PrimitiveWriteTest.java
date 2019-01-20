package tutorials.ioprogramming;

import java.io.*;

public class PrimitiveWriteTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try{
		FileOutputStream f = new FileOutputStream("C:\\prim.txt",true);
		DataOutputStream d = new DataOutputStream(f);
		FileOutputStream ferr = new FileOutputStream("C:\\error.log");
		PrintStream p = new PrintStream(ferr);
        System.setErr(p); 
        String name = "Avijit";
        double salary = 56894.23;
        int age = 25;
        boolean active = true;
        char grade = 'A';
        d.writeUTF(name);
        d.writeInt(age);
        d.writeBoolean(active);
        d.writeChar(grade);
        d.writeDouble(salary);
        d.flush();
        d.close();
		}
		catch(FileNotFoundException nfx) {
			System.err.println(nfx);
		}
		catch(IOException ex) {
			System.err.println(ex);
		}
	}

}
