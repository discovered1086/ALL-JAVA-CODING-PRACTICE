package com.kingshuk.multithreading.threadprogramming.threadingin2017.practicingjoin;

public class JoinTestHarness {

    public static void main(String[] args) {
        Thread.currentThread().setName("Main Thread");

        Thread t1=new JustPrintingForJoin();
        t1.setName("First Thread");

        Thread t2=new JustPrintingForJoin();
        t2.setName("Second Thread");

        t1.start();
        t2.start();

        //Join should be called before defining the task for the thread where it's called.
        //For example the join call is useless here because we have defined the main thread's task before the join.
        //This is because we've already put the main thread in the game and it has started playing it. In we ask
        //the main thread to wait for the t1 and t2 thread to complete after it's game has already started, there's no point

        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" is printing "+i);
        }

        try {
            t1.join();      //This doesn't mean that t2 will also wait for the t1 thread to finish. t1 and t2 are running in parallel.
                            // t2 has no effects when t1.join() is called.
                            //It's a way for telling the main thread in this case (or thread from where the join is called) to wait until
                            //the t1 thread is done with it's work. Adding a t2.join() just adds more misery for the main thread here. Then it
                            //has to wait for both t1 and t2 to finish their work before it can continue to do it's work.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //Here only the below statement execution is impacted by the join call on either t1 or t2 or on both of them
        System.out.println("Main thread has done it's work.....");
    }
}
