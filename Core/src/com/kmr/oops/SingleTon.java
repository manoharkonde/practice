package com.kmr.oops;

public class SingleTon {
    private SingleTon() {
        
    }
private static SingleTon s =null;
private static SingleTon getInstance() {
    if(s==null){
       s = new SingleTon();
    }
        return s;
        }
public static void main(String[] args) {
    System.out.println(SingleTon.getInstance().hashCode());
    SingleTon s = new SingleTon();
    System.out.println(s.hashCode());
    
}
}
