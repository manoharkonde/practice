package com.kmr.oops.polymorphism;

public class ExceptionWRTOverridingChild extends ExceptionWRTOverriding{
    
//    Multiple markers at this line
//    - overrides com.kmr.oops.polymorphism.ExceptionWRTOverriding.method
//    - Exception Exception is not compatible with throws clause in 
    @Override
    void method() throws Exception{
        // TODO Auto-generated method stub
        super.method();
    }

}
