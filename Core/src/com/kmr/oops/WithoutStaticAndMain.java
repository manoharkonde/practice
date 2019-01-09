package com.kmr.oops;

public class WithoutStaticAndMain {
    static int i = meth();
    public static int meth() {
        System.out.println("meth()..");
        System.exit(0);
        return 10;
    }

}
