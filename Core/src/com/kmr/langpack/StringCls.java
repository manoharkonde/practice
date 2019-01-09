package com.kmr.langpack;

public class StringCls {
public static void main(String[] args) {
    //String class comparing
    System.out.println("==String class comparing==");
    String s = new String("manohar");
    String s2 = new String("manohar");
    System.out.println("== operator: "+s==s2);
    System.out.println("String class equals: "+s.equals(s2));
    
    //String Buffer Class comparison.
    System.out.println("==String Buffer Class comparison==");
    StringBuffer  sb = new StringBuffer("manohar");
    StringBuffer  sb2 = new StringBuffer("manohar");
    System.out.println(sb==sb2);
    System.out.println(sb.equals(sb2));
    
    //interning
    System.out.println("==interning==");
    String s3 = new String("manoharm");
    String s4 = s3.intern();
    System.out.println(s4);
    System.out.println(s3==s4);
    String s5 = "manohar";
    System.out.println(s4==s5);
    
    //String methods
    System.out.println("==String methods==");
    System.out.println(s3.indexOf('x'));
}
}
