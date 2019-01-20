package tutorials.ioprogramming;

import java.io.Externalizable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Game 
implements Externalizable
{
	private static final long serialVersionUID = 2000;
	String title;
	int numberOfTerrorist;
	int numberOfCounterTerrorist; 
	transient int numberOfPlayer;
	long highestScore;
	CSMap currentMap;
	
	public CSMap getCurrentMap() {
		return currentMap;
	}


	public void setCurrentMap(CSMap currentMap) {
		this.currentMap = currentMap;
	}


	public Game() {
		super();
	}

	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getNumberOfPlayer() {
		return numberOfPlayer;
	}


	public void setNumberOfPlayer(int numberOfPlayer) {
		this.numberOfPlayer = numberOfPlayer;
	}


	public long getHighestScore() {
		return highestScore;
	}


	public void setHighestScore(long highestScore) {
		this.highestScore = highestScore;
	}


	
	public void readExternal(ObjectInput in) 
	throws IOException,
			ClassNotFoundException {
	System.out.println("de serializable");
	   title = in.readUTF();
		numberOfCounterTerrorist =  in.readInt();
		numberOfTerrorist =  in.readInt();
		numberOfPlayer = numberOfCounterTerrorist + numberOfTerrorist;
		currentMap = (CSMap) in.readObject();
	}

	public void writeExternal(ObjectOutput out)
	throws IOException {
		System.out.println("serializable");
		out.writeUTF(title);
		out.writeInt(numberOfCounterTerrorist);
		out.writeInt(numberOfTerrorist);
		out.writeObject(currentMap);
		
	}

}

class CSMap implements Serializable{
	String mapTitle;
	float area;
	long timeLimit;
	public CSMap() {
		super();
	}
	public String getMapTitle() {
		return mapTitle;
	}
	public void setMapTitle(String mapTitle) {
		this.mapTitle = mapTitle;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public long getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(long timeLimit) {
		this.timeLimit = timeLimit;
	}
	
}