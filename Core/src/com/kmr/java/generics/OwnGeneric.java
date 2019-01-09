package com.kmr.java.generics;

public class OwnGeneric<M> {
    M obj;
    OwnGeneric(M obj) {
        this.obj = obj;
    }
public void show() {
    System.out.println("Type of Object: "+obj.getClass().getName());
}
public M getObject() {
    return obj;
}
}
