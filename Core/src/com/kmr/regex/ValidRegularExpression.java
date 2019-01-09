package com.kmr.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidRegularExpression {
public static void main(String[] args) {
    //valid identifier
    //Pattern pattern = Pattern.compile("[a-zA-Z][0-9]+");
    
    //valid mobile no.The 1st digit should be 7 to 9.
    //Pattern pattern = Pattern.compile("[7-9][0-9]{9}");
    
    //mail validation.
    try{
    Pattern pattern=Pattern.compile("[a-zA-Z][a-zA-Z0-9-.]*@[a-zA-Z]+([.][a-zA-Z]+)+");
    Matcher m=pattern.matcher("manohar.mano@gmail89.com");
    if(m.find()&&m.group().equals("manohar.mano@gmail89.com"))
    {
        System.out.println("valid identifier & identifier is: "+m.group());
    }
    else
    {
        System.out.println("invalid identifier & identifier is: "+m.group());
    }
    }catch (Exception e) {
        System.out.println("Match doesn't found from input");
       //e.printStackTrace();
    }
}
}
