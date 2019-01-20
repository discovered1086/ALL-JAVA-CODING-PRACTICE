package tutorials.ioprogramming;


import java.io.*;


public class PrimeReaderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			FileInputStream f = new FileInputStream("C:\\prim.txt");
			DataInputStream d = new DataInputStream(f);
			FileOutputStream ferr = new FileOutputStream("C:\\error.log");
			PrintStream p = new PrintStream(ferr);
	        System.setErr(p); 
	        String name = "";
	        double salary = 0.0;
	        int age = 0;
	        boolean active = false;
	        char grade = ' ';
	        name = d.readUTF();
	        age  = d.readInt();
	       active = d.readBoolean();
	        grade = d.readChar();
	        salary = d.readDouble();
	        System.out.println(" Name " + name  + " age " + age  + "  active " + active ) ;
	        System.out.println(" grade " + grade + " salary " +  salary) ;
	        
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
