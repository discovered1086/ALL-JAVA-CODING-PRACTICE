package tutorials.ioprogramming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game cs  = new Game();
		
		try {
			FileInputStream f = new FileInputStream("C:\\cs.save");
			ObjectInputStream o = new ObjectInputStream(f);
			cs = (Game) o.readObject();
			System.out.println(cs.getHighestScore() + " " + cs.getCurrentMap().getMapTitle());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		}

}
