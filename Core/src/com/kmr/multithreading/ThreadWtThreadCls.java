package com.kmr.multithreading;

public class ThreadWtThreadCls extends Thread{
    public void run(){
        for(int i=1; i<=10; i++) {
            System.out.println("Child Thread has been created: "+i);
        }
    }
    /*public void test(){
        System.out.println("thread");
    }*/
public static void main(String[] args) {
    ThreadWtThreadCls tc = new ThreadWtThreadCls();
    tc.start();
//    java.lang.IllegalThreadStateException
//    tc.start();
    for(int i=1; i<=5; i++) {
        Thread.yield();
        System.out.println("Main Thread has been created: "+i);
    }
}
}
