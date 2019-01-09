package com.kmr.langpack;

public class Cloning implements Cloneable{
    String name = "manohar";
    int phone = 564320000;
public static void main(String[] args) throws CloneNotSupportedException {
    Cloning obj1 = new Cloning();
    Cloning obj2 =(Cloning)obj1.clone();
//    obj2.name = "sham";
//    obj2.phone =899009876;
    System.out.println("obj1 Name: "+obj1.name+" & phone: "+obj1.phone);
    System.out.println("cloned obj2 Name: "+obj2.name+" & phone: "+obj2.phone);
}
}
