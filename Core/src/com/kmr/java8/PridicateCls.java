package com.kmr.java8;

public class PridicateCls {
    
public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int a = 4;
    String s = "mano";
    String s2 = "mano";
    boolean  strCheck = s.equals(s2)?true:false;
    
    int result = a == 7 ? 1 : 8;
    boolean val = x==y?true : false;
System.out.println(result);
System.out.println(val);
System.out.println("String Check = "+strCheck);
}
}
