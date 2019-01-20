package mypractice.jvmarchitecture;

public class DisplayClassLoaderHarness {
    public static void main(String[] args) {
        SSNHolder s1=new SSNHolder();

        Class c1=s1.getClass();

        System.out.println(c1.getClassLoader());

        String s="Kingshuk";

        Class stringClass=s.getClass();

        System.out.println(stringClass.getClassLoader());
    }
}
