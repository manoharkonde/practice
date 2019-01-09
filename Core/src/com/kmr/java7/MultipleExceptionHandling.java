package com.kmr.java7;

public class MultipleExceptionHandling {
public static void main(String[] args) {
    
    try {
        int array[] = new int[10];
        array[10]=30/1;
        
    }
    catch(ArrayIndexOutOfBoundsException | ArithmeticException  e){
        System.out.println(e);
    }
    /*catch(ArithmeticException a)
    {
        System.out.println(a);
    }
    catch (Exception e) {
        // TODO: handle exception
    }*/
}
}
