package mypractice.basicexamples.operators;

public class HashCodeGen {

	int instanceField;
	  {
	    int hc = hashCode();
	    instanceField = hc;
	    for (int i = 0; i < 32; i++) {
	      System.out.print((hc & 0x80000000) != 0 ? '1' : '0');
	      hc <<= 1;
	    }
	  }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(new HashCodeGen().instanceField);
		 System.out.println(new HashCodeGen().instanceField);
	}

}
