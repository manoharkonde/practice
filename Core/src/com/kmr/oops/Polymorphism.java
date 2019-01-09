package com.kmr.oops;

public class Polymorphism {
public int methodIntArt() {
        return 0;
    }
public int methodIntArg(int i) {
    return i;
}
public int methodIntArg(int j, int k) {
    return j+k;
}
public static void main(String[] args) {
    Polymorphism p = new Polymorphism();
    System.out.println(p.methodIntArg(20,30));
}
}
