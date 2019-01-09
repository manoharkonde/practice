package com.kmr.logicalpro;

public class BubbleSort {
    static void bubbleSorting(int arr[]) {
        int temp, count =0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if(arr[j-1]>arr[j]) {
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                }
                count = count +1;
            }
            count = count +1;
        }
        System.out.println("Number of times sorting performed: "+count);
        
    }
    public static void main(String[] args) {
        //12,14,20,37,56,87,98,100
        int array[] ={100, 20, 20, 14, 14,56,37, 87,12,98};
        System.out.println("before sort..");
        for(int i=0; i < array.length; i++){  
            System.out.print(array[i] + " ");  
    }  
        System.out.println();
        bubbleSorting(array);
        
       System.out.println("After sort..");
        for(int i=0; i < array.length; i++){  
            System.out.print(array[i] + " ");  
    } 
    }

}
