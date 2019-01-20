package tutorials.ioprogramming.serialization;
import java.util.*;
import java.io.*;

public class Die implements Serializable {

  private int face = 1;
  Random shooter = new Random();

  public Die(int face) {
    this.face = (int) (Math.abs(face % 6) + 1);
  }

  public int getFace() {
    return this.face;
  }

  public void setFace(int face) {
    this.face = (int) (Math.abs(face % 6) + 1);
  }

  public int roll() {
    this.face = (int) ((Math.abs(shooter.nextInt()) % 6) + 1);
    return this.face;
  }

  public static void main(String[] args) {

    Die d = new Die(2);
    for (int i = 0; i < 10; i++) {
      d.roll();
      System.out.println(d.getFace());
    }

  }

}
