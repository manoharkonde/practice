package com.kmr.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamOperations {
public static void main(String[] args) {
    
    List<String> memberNames = new ArrayList<>();
    memberNames.add("Amitabh");
    memberNames.add("Shekhar");
    memberNames.add("Aman");
    memberNames.add("Rahul");
    memberNames.add("Shahrukh");
    memberNames.add("Salman");
    memberNames.add("Yana");
    memberNames.add("Lokesh");
    memberNames.add("mmmmmm");
    
    memberNames.stream().filter((s) -> s.startsWith("A"))
    .forEach(System.out::println);
    
    memberNames.stream().filter((s) -> s.startsWith("A"))
    .map(String::toUpperCase)
    .forEach(System.out::println);
    
    System.out.println("==Sorted==");
    memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
    
    System.out.println("==anymatch==");
    boolean matchedResult = memberNames.stream()
            .anyMatch((s) -> s.startsWith("m"));
    System.out.println(matchedResult);
    
    System.out.println("==allmatch==");
    matchedResult = memberNames.stream()
            .allMatch((s) -> s.startsWith("A"));

System.out.println(matchedResult);

System.out.println("==nonematch==");
matchedResult = memberNames.stream()
            .noneMatch((s) -> s.startsWith("A"));
    
    
}
}
