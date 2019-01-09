package com.kmr.multithreading;

public class ThreadPriority implements Runnable {
    public void run(){
        for(int i=1; i<=5; i++) {
            //Thread.yield();
            System.out.println("Child Thread has been created: "+i+" and priority is: "+Thread.currentThread().getPriority());
        }
    }
    public static void main(String[] args) {
        ThreadPriority tp = new ThreadPriority();
        Thread t = new Thread(tp);
        t.setPriority(10);
        t.start();
//        acceptable priority value 1-10 or else we will get following excep..
//      Exception in thread "main" java.lang.IllegalArgumentException
//        Thread.currentThread().setPriority(11);
        for(int i=0;i<5;i++)
        {
            //Thread.yield();
            System.out.println("main thread");
        }
        System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());
        
    }
}
