package com.kmr.typesofvariables;

public class Variables {
    //instance variables
    int num = 20;
    String name;
    int x =10;
  static int y = 20;
    
    //static variables
    static String staticvar;
    public String meth() {
       String address;
      // System.out.println(address);
        return null;
    }
    
public static void main(String[] args) {
    Variables var = new Variables();
 System.out.println("num Value: "+var.num);   
 System.out.println("Name Value: "+var.name);
 System.out.println("Address: "+var.meth());
 System.out.println("Static Variables: "+staticvar);
 
 var.x= 888;
 var.y = 999;
 
 Variables var2 = new Variables();
 System.out.println(var.x+"---"+var.y);
 System.out.println(var2.x+"---"+var2.y);
}
}
