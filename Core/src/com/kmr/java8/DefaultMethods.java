package com.kmr.java8;

public interface DefaultMethods {
default void move(){
    System.out.println("move method from Defaultmethods interface");
}
default void drag(){
    System.out.println("next grag meth..");
}

void anotherMeth();
}
