package com.kmr.oops.constructor;

public class Constructors {
private static int i;
Constructors(){
    //System.out.println();
    //CE:Constructor call must be the first statement in a constructor
    //super();
    this(i);
    System.out.println("no arg constructor.");
//    this();
}
Constructors(int i){
//    super();
    System.out.println("single arg constructor");
}
public static void main(String[] args) {
    Constructors c = new Constructors();
    System.out.println(c.i);
}
}
