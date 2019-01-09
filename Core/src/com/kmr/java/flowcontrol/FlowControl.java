package com.kmr.java.flowcontrol;

public class FlowControl {
    final int y=20;
    public void check() {
        int x=10;
//        int y=20;
        if(x==y)
//           int z=20; 
        x=y;
        System.out.println("");
        switch (y) {
        case y:
            System.out.println("Switch: 20");
           // break;

//        default:
//            break;
        }
    }
    int a=25;
    
    public static void main(String[] args) {
        FlowControl fc = new FlowControl();
        fc.check();
    }

}
