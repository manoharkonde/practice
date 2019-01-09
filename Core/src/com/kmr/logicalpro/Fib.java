package com.kmr.logicalpro;

import java.util.ArrayList;
import java.util.List;

public class Fib {
public static void main(String[] args) {
    int n1=0,n2=1,n3;
    System.out.println(n1+" "+n2);
    for(int i=2; i<10;i++){
        n3=n1+n2;
        System.out.println("\t"+n3);
        //List list = new ArrayList<>();
        n1=n2;
        n2=n3;
    }
}
}
