package com.kmr.logicalpro;

public class Palindrome {
    
public static void main(String[] args) {
    int r, sum=0, temp;
    int n = 434;
    temp=n;
    while(n>0) {
        r=n%10;
        sum = (sum*10)+r;
        n = n/10;
    }
    if (temp==sum){
        System.out.println("given is palindrome and no is: "+temp);
    }
    else {
        System.out.println("given is not an palindrome and no is: "+temp);
    }
    //factorial number
    int fact =1;
    for(int i=1;i<6;i++) {
        fact = fact*i;
    }
    System.out.println("factorial of given: "+fact);
}
}
