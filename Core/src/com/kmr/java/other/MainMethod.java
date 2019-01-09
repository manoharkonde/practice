package com.kmr.java.other;

public class MainMethod {
    static {
        System.out.println("static block");
    }
    public static void main(String[] args) {
        MainMethod mm = new MainMethod();
        System.out.println(mm.hashCode());
        Object obj = new Object();
        System.out.println(obj);
       System.out.println("main method "+String.valueOf("hi")); 
       
       
    }
    public static synchronized void main(int... args) {
        System.out.println("main with int args");
    }

}
