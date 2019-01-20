package mypractice.jvmarchitecture;

public class MultipleClassLoading {
    public static void main(String[] args) {
        /**
         * Here we're going to prove that no matter how many objects
         * of a particular class is created, the class is loaded into memory
         * exactly once and there's only one instance of the Class object
         * that represents the class in memory
         */
        SSNHolder s1=new SSNHolder();
        SSNHolder s2=new SSNHolder();

        Class c1=s1.getClass();
        Class c2=s2.getClass();

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1==c2);
    }
}
