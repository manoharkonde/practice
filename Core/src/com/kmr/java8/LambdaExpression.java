package com.kmr.java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {
public static void main(String[] args) {
        
/*        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread started");
            }
        }).start();*/
         
    
    //another way to start
        new Thread(() -> {
            System.out.println("thread started through lambda expression");
        }).start();
        
        List<Integer> phoneList = new ArrayList<>();
        phoneList.add(520456);
        phoneList.add(567324);
        phoneList.add(589213);
        phoneList.add(587321);
        
        phoneList.forEach(phone -> {
        System.out.println(phone); 
        }
       );
        
}
}
