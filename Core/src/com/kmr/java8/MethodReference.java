package com.kmr.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodReference {
    //reference types
    //Reference to static method
    //reference to instance method from instance.
    //reference to instance method from class type
    //reference to constructor
public static void main(String[] args) {
    String name = "manohar";
    //int size = String::length;
    System.out.println();
    
    List<Integer> list = Arrays.asList(21,34,45,67,90,100);
  //Reference to static method
    Optional< Integer> max = list.stream().reduce(Math::max);
   // max.ifPresent(value -> System.out.println(value));
    
    //reference to instance method from instance.
    max.ifPresent(System.out::println);
    
//    Reference to instance method from class type – Class::instanceMethodName
    
    List<String> stringList = Arrays.asList("mano","reference","to", "instance", "method");
    List<String> sortedStringList = stringList.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
   //sortedStringList.forEach(System.out::println);
    System.out.println(sortedStringList);
    
    List<String> sortedAlt = stringList
            .stream()
            .sorted(String::compareTo)
            .collect(Collectors.toList());
    System.out.println(sortedAlt);
    
    List<Integer> integers = IntStream
            .range(1, 100)
            .boxed()
            .collect(Collectors.toCollection( ArrayList::new ));

Optional<Integer> max1 = integers.stream().reduce(Math::max);

max1.ifPresent(System.out::println);
}
}
