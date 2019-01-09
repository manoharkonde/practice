package com.kmr.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
 
    public static void main(String[] args) {

        /*String[] names = {"manohar","pandu","nani"};
        String[] numbers = new String[2];
        numbers[0]="hello";
        numbers[1]="hi";
        numbers[2] = "hel";
        numbers[3] = "";
        System.out.println(numbers[3]);*/
        List<String> list = new ArrayList<String>();
        list.add("mano");
        list.add("nani");
        //list.add(123);
        String name = list.get(0);
        System.out.println(name);
        System.out.println(list.get(5));
        
}
}
 