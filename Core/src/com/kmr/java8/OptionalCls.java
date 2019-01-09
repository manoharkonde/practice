package com.kmr.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalCls {
public static void main(String[] args) {
    List<Integer> optionalList = new ArrayList<>();
    optionalList.add(520456);
    optionalList.add(567324);
    optionalList.add(589213);
    optionalList.add(587321);
    Optional<Integer> optionNotNull = Optional.of(25);
    
    //nullpointerException case
   // Optional<Integer> optionNotNull = Optional.of(null);
    optionNotNull.isPresent();
    optionNotNull.ifPresent(System.out::println);
    System.out.println(optionNotNull.get());
    
    System.out.println("==ofnullable==");
    Optional<String> option = Optional.ofNullable(null);
    System.out.println(option.isPresent());
//    Exception in thread "main" java.util.NoSuchElementException: No value present
//    at java.util.Optional.get(Unknown Source)
//    at com.kmr.java8.OptionalCls.main(OptionalCls.java:24)
    //System.out.println(option.get());
    
    System.out.println("==empty==");
    Optional<Integer> empty = Optional.empty();
    System.out.println(empty.isPresent());
//    empty.orElse(new Integer(12));
//    empty.ifPresent(System.out::println);
//    empty.orElseThrow(NoSuchElementException::new);
//    System.out.println(empty.get());
    //empty.get();
    
}
}
