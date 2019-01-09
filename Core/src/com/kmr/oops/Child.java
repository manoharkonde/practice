package com.kmr.oops;

public class Child extends Parent implements Interface1,Interface2{
public void childMeth() {
    System.out.println("Child");
}
/*@Override
    public void parentMeth() {
        //super.parentMeth();
        System.out.println("Parent method from Child Cls");
    }*/

@Override
public void interface2() {
    // TODO Auto-generated method stub
    
}

@Override
public void interface1Meth() {
    // TODO Auto-generated method stub
    
}
}
