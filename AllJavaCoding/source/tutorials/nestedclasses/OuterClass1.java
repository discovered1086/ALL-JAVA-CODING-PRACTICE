package tutorials.nestedclasses;

 class Outside {
  public static class Skinside {

  }

  public class Inside {

  }

}

public class OuterClass1 {

  public static void main(String[] arg) {
    Outside.Skinside example = new Outside.Skinside();
  }

}
