package mypractice.memorymanagement.garbagecollection;

/**
 * Created by kingshuk on 7/20/17.
 */
public class GarbageCollectionTest {

    public static void main(String[] args) throws InterruptedException {
        //Getting an instance of the runtime object so that we can check how much free memory is left
       Runtime runtime=Runtime.getRuntime();

       System.out.println("Free memory left before creating objects "+runtime.freeMemory()/(1024*1024)+" MB");

       int i=0;
       for(i = 0;i<=1000000; i++){
           Thread.sleep(2000);
           Student student=new Student("Kingshuk",30);

           if(i==500000){
               System.out.println("Free memory half way through object creation "+runtime.freeMemory()/(1024*1024)+" MB");
           }
        }

        System.out.println("Free memory after object creation "+runtime.freeMemory()/(1024*1024)+" MB");

        //System.gc(); //This is just a suggestion to the JVM that it should probably run the garbage collection. There's no
        //guarantee of JVM actually complying to it.

        System.out.println("Free memory after calling GC method "+runtime.freeMemory()/(1024*1024)+" MB");

    }
}
