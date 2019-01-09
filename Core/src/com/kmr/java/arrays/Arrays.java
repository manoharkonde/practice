package com.kmr.java.arrays;

public class Arrays {
    public static void main(String[] args) {
        
        int[] oneDArray = {12,23,34,56};
        
        //Declaration time we can't able to give size.
//        int oneDArray3[5];
        
        int[][] twoDArray;
        int [][][] threeDArray = new int[3][][];
        
        //For every array type corresponding classes are available but these classes are part of java language and not available to the programmer
        //level
        // int[] [I , int[][] [[I, double[] [D
        
        //int[] oneDArray2 = new int[-10];
        long[] oneDArray6 = new long[0];
//        float[] oneDArray3 = new float[10.50];
//        double[] oneDArray4 = new double[10.56];
//        String[] oneDArray5 = new String["mani"];
//        The allowed data types to specify array size are byte, short, char, int.
        System.out.println("oneDArray Length: "+oneDArray.length);
        //Exception in thread "main" java.lang.NegativeArraySizeException
        //System.out.println("oneDArray2 Length :"+oneDArray2);
        
        System.out.println("oneDArray6 Length : "+oneDArray6.length);
//        Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
//        at com.kmr.java.arrays.Arrays.main(Arrays.java:30)
      //  int size = 2147483647;
        //int[] oneDArray7 = new int[size];
        
        //memory representation
        
        int [][] a = new int[5][5];
        int aArrayTotalSize= a[0].length+a[1].length;
        System.out.println("aArrayTotalSize : "+aArrayTotalSize);
        //[[I@65685e30 - classname@hexadecimalStringrepresentationnofhashcode.
        System.out.println(a);
        
        int[][] b ={{10,20,30},{40,50}};
        System.out.println("b01 val: "+b[0][2]);
        System.out.println("b11 val: "+b[1][1]);
        
        //anonymous arrays.
        System.out.println(new int[]{10,30,45});
        
        
    }

}
