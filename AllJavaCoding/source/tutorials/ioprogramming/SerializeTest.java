package tutorials.ioprogramming;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game cs  = new Game();
		CSMap cm = new CSMap();
		cm.setArea(1245.36f);
		cm.setMapTitle("DUST 2");
		cm.setTimeLimit(5*60*60);
		cs.setCurrentMap(cm);
		cs.setTitle("Counter Strike");
		cs.setNumberOfPlayer(16);
		cs.setHighestScore(32);
		try {
			FileOutputStream f = new FileOutputStream("C:\\cs.save");
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(cs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		}

}
