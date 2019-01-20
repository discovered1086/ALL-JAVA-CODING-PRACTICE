package tutorials.ioprogramming;
import java.io.*;

public class FileInputTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileInputStream f =  null;
		try {
			f = new FileInputStream("C:\\Documents and Settings\\Administrator\\Desktop\\Trigger.txt");
			int b =0;
			while((b=f.read()) != -1){
				System.out.print((char)b);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				if(f!= null)
					f.close();
			}
			catch(IOException ex){
				ex.printStackTrace();
			}
		}

	}
}
