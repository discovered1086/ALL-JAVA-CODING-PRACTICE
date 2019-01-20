package mypractice.collectionsandgenerics.genericspractice;

import mypractice.collectionsandgenerics.genericselements.MyBasicGenericClass;

/**A basic generic practice class
 * Created by CO21321 on 2/8/2018.
 */
public class BeginWithBasicGenericsHarness {
    public static void main(String[] args) {
        /**
         * Few basic things to remember about the generics
         * 1. public  <T extends Object> void getMyNumber(ArrayList<T> numberList)
         *
         * is same as
         *
         * public void getMyNumber(ArrayList<? extends Integer> numberList)
         *
         * 2. When used for collections, we can't use inheritance along with generics, which means
         *
         * List<Object> myObject=new ArrayList<Integer>(); is NOT allowed
         *
         * It has to be
         *
         * List<Object> myObject=new ArrayList<Object>(); is NOT allowed
         */
        MyBasicGenericClass<Integer> myBasicGenericClass=new MyBasicGenericClass<>(100);

        myBasicGenericClass.printTheClassType();

        MyBasicGenericClass<String> myBasicGenericClass2=new MyBasicGenericClass<>("Kingshuk");

        myBasicGenericClass2.printTheClassType();
    }
}
