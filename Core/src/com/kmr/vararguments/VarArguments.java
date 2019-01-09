package com.kmr.vararguments;

public class VarArguments {
    //priority.
    public static int sum() {
        System.out.println("o orgs method");
        return 0;
    }
    
    public static int sum(int input) {
        System.out.println("single org method");
        return input;
    }
    
    //jvm will gives least priority for var-arg method like switch default.
    public static int sum(float salary, int... input) {
        int total = 0;
        for(int i=0; i<input.length; i++) {
            total = total +input[i];
        }
        System.out.println("var-arg method.");
        System.out.println("Salary input: "+salary);
        return total;
    }
    /*public static void main(String[] args) {
        System.out.println(VarArguements.sum(23.00f,20));
    }*/

}
