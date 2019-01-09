package com.kmr.langpack;

public class StringBufferCls {
    
public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity());
    sb.append("manoharvenkatchinmanoharvenkatch34+23");
    System.out.println(sb.capacity());
    
    System.out.println("==SB initial Capacity==");
    StringBuffer sb2 = new StringBuffer(4);
    System.out.println(sb2.capacity());
    sb2.append("manoharmanohar1618");
    System.out.println(sb2.toString());
    System.out.println(sb2.capacity());
    System.out.println(sb2.toString());
    
    System.out.println("==String==");
    StringBuffer sb3 = new StringBuffer("manohar");
    System.out.println(sb3.capacity());
    sb3.delete(5,9);
    System.out.println(sb3.toString());
    
    
}
}
