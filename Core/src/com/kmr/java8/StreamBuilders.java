package com.kmr.java8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilders {
    public static void main(String[] args){
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
       // stream.forEach(p -> System.out.println(p));
        stream.forEach(System.out::println);
        
//        Stream<Date> streamGenerator = Stream.generate(()-> {return new Date();});

        System.out.println("==Stream Chars==");
        IntStream stream1 = "12345_abcdefg".chars();
        stream1.forEach(p -> System.out.println(p));
         
        //OR
         
        Stream<String> stream2 = Stream.of("A$B$C".split("\\$"));
        stream2.forEach(p -> System.out.println(p));
    }
}
