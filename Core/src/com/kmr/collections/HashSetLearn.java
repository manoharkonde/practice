package com.kmr.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetLearn {
public HashSetLearn(){
}
public static void main(String[] args) {
    List l = new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    HashSet sh = new HashSet<>(l);
    System.out.println(sh.add(null));
    System.out.println(sh.add(null));
    System.out.println(sh.add(3));
    System.out.println("Hash Set Data: "+sh);
    
    
}
}
