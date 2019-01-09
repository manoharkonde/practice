package com.kmr.multithreading;

public class ThreadInterrupt extends Thread{
    public void run() {
        try {
        for(int i=1; i<=10; i++) {
            System.out.println("Child Thread and no is: "+i);
            
                Thread.sleep(10000);
        }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    
    }
    public static void main(String[] args) {
        ThreadInterrupt ti = new ThreadInterrupt();
        ti.start();
        ti.interrupt();
    }
}
