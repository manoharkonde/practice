package com.kmr.collections;

import java.text.Collator;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetLearn {
public static void main(String[] args) {
    TreeSet ts = new TreeSet<>();
    //null also not allowed, even if we add get r
    //ts.add(null);
    /*ts.add(3);
    ts.add(6);
    ts.add(8);*/
    //heterogenious objects are not allowed, we will get ClassCastException.
    //ts.add("mano");
   // ts.add(null);
    System.out.println(ts.comparator());
    System.out.println(ts);
   // Comparator<T>
}
}
