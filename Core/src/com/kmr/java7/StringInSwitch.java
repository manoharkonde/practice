package com.kmr.java7;

public class StringInSwitch {
    public static String whichDay(String inputDay) {

        String sunDay = "SUND DAY";
        String monDay = "MON DAY";
        String tuesDay = "TUES DAY";
        
        switch (inputDay) {
        case "sunDay":
            return sunDay;
        case "monDay":
            return monDay;
        default:
            System.out.println("Input doesn't match");
            break;
        }
        
            
        return inputDay;
    }

    public static void main(String[] args) {
System.out.println(StringInSwitch.whichDay("Day"));
    }
}
