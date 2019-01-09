package com.kmr.logicalpro;

public class ArmstrongNumber {
public static void main(String[] args) {
    //eg: 371 = (3*3*3)+(7*7*7)+(1*1*1)  
//    where:  
//        (3*3*3)=27  
//        (7*7*7)=343  
//        (1*1*1)=1  
//        So:  
//        27+343+1=371 
    for(int i=0; i<1000; i++) {
    int r, n=i, temp, c=0;
    temp = n;
    while(n>0) {
        r = n%10;
        n = n/10;
        c = c+(r*r*r);
    }
    if(temp==c){
        System.out.println("Given no is armstrong & no is: "+temp);
    }
//    else{
//        System.out.println("Given no is not an armstrong & no is: "+temp);
//    }
    }
}
}
