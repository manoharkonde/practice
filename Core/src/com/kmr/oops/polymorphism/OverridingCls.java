package com.kmr.oops.polymorphism;

public class OverridingCls implements OverriddenCls {

    @Override
    public int sum(int i, int j) {

        return i+j;
    }

    @Override
    public void update() {
System.out.println("Update overriding");        
    }

    //from 1.5 version we can add return type child of overridedn
    @Override
    public String covariantMeth() {
        // TODO Auto-generated method stub
        return "Cov";
    }
    public static void main(String[] args) {
        OverridingCls oc = new OverridingCls();
        System.out.println(oc.sum(100, 890));
        System.out.println( oc.covariantMeth());
    }

}
