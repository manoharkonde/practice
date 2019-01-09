package com.kmr.java.innerclasses;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
            Outer.Inner inner = outer.new Inner();
            inner.innerMethod();
//        outer.outerMethod();
        //Outer.Inner inner = outer.
    }
}

class Outer {
    class Inner {
        public void innerMethod() {
            System.out.println("Inner class inner Method.");
        }
    }
    
    /*public void outerMethod() {
        Inner inner = new Inner();
        inner.innerMethod();
    }*/
    

}
    
