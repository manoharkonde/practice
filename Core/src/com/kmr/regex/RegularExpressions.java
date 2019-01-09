package com.kmr.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    
    public static String stringSplitMeth(String input) {
        String value = null;
        String[] values = input.split("\\.");
        for(String s:values){
            value = value+s+"\n";
        }
        return value;
    }
public static void main(String[] args) {
    Pattern pattern = Pattern.compile("n?");
    Matcher matcher = pattern.matcher("manohar. kondi9@gmail.com");
    while(matcher.find()) {
    System.out.println(matcher.start()+"---"+matcher.end()+"---"+matcher.group());
    }
    
    //System.out.println(RegularExpressions.stringSplitMeth("www.kmrs.com"));
    
    /*Pattern p=Pattern.compile("[a-zA-Z][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
Matcher m=p.matcher(args[0]);
if(m.find()&&m.group().equals(args[0]))
{
System.out.println("valid mail id");
}
else
{
System.out.println("invalid mail id");
}*/
}
}

