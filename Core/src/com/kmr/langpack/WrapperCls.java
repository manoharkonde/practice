package com.kmr.langpack;

public class WrapperCls {
    public static void main(String[] args) {
        Integer i = new Integer("10");
        String s = new String("mano");

        Boolean booleanValue = new Boolean(true);
        System.out.println(booleanValue);

        System.out.println("==String to Primitive==");
        int stringInt = Integer.parseInt("10");
        float stringToFloat = Float.parseFloat("43.78f");
        System.out.println(stringToFloat);
        System.out.println(stringInt);
        // System.out.println(intStr.p);

        System.out.println("==Wrapper to Primitive==");
        Integer wrapInt = new Integer(10);
        System.out.println(wrapInt.intValue());
        
        System.out.println("==primitive to wrapper==");
        int age = 30;
        Integer wrapInt2 = Integer.valueOf(age);
        System.out.println(wrapInt2);
        int wrapToPrimitive = wrapInt2.intValue();
        System.out.println(wrapToPrimitive);
        
        Integer itr = 20;
        int i2 = itr;
                //Integer.valueOf(35);
        int w2p = itr.intValue();
        
        String s2 = new String("kmr");
       float f2 = Float.parseFloat("23.78f");
       System.out.println(f2);
        
    }
}
