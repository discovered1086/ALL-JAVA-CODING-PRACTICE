package tutorials.nestedclasses;



public class InnerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass o = new OuterClass();
		 // OuterClass.A a = o.new A();
		OuterClass.B b = o.new B("A");
	}

}
