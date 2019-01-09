package com.kmr.multithreading;

public class ThreadWtRunnable implements Runnable{
public void run() {
    for(int i=1; i<=10; i++) {
        System.out.println("Runnable Child Thread has created: "+i);
    }
}
public static void main(String[] args) {
    ThreadWtRunnable tr = new ThreadWtRunnable();
    Thread t = new Thread(tr);
    t.start();
    System.out.println("Runnable Main Thread has created.");
    System.out.println(Thread.currentThread().getName());
    //System.out.println();
    Thread.currentThread().setName("Customized Name");
    System.out.println(Thread.currentThread().getName());
}
}
