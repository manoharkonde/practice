package com.kmr.java8;

import java.util.ArrayList;
import java.util.List;

public class DefaultMethodsImpl implements DefaultMethods {
    
    public void move() {
        System.out.println("customizing default move method in impl");
    }
public static void main(String[] args) {
    
   DefaultMethodsImpl defImpl = new DefaultMethodsImpl();
   defImpl.move();
   defImpl.anotherMeth();
    
   List<DefaultMethods> listDefault = new ArrayList<DefaultMethods>();
   listDefault.add(DefaultMethodsImpl::new);
   listDefault.add(DefaultMethodsImpl::new);
   listDefault.add(DefaultMethodsImpl::new);
   
   listDefault.forEach(DefaultMethods -> DefaultMethods.move());
}

@Override
public void anotherMeth() {
System.out.println("interface abstract method overriding in impl");    
}
}
