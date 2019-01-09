package com.kmr.java.generics;

import java.util.ArrayList;

public class OwnGenricDemo {
    public void method(ArrayList<?> al) {
        ArrayList<String> arrayList = new ArrayList<String>();
        al.add(null);
    }
public static void main(String[] args) {
    OwnGeneric<Integer> num = new OwnGeneric<Integer>(12);
    num.show();
    System.out.println(num.getObject());
    
    
}
}
