package com.kmr.innercls;

class Outer {
    int x = 100;
    String name = "vdhansh";
    
    public void outerMethod() {
        Inner i = new Inner();
        i.methodInner();
        System.out.println("outer method--"+this);
    }
    
    class Inner{
        int x = 200;
        public void methodInner() {
            System.out.println("innermethod & current x values is: "+this);
        }
    }
/*public static void main(String[] args) {
    Outer o = new Outer();
    o.outerMethod();
    System.out.println("hello");
} */ 
}

public class Test {
    public static void main(String[] args) {
        new Outer().outerMethod();
    }
}
