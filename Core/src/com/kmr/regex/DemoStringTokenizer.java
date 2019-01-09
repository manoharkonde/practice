package com.kmr.regex;

import java.util.StringTokenizer;

public class DemoStringTokenizer {
public static void main(String[] args) {
    //by default it will take pattern as space.
    StringTokenizer token = new StringTokenizer("This@will@help@us@to@split@words@as@tokens","@");
    while(token.hasMoreTokens()) {
        System.out.println(token.nextToken());
    }
}
}
