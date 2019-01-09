package com.kmr.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsToCollections {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<20; i++) {
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        
        /*List<Integer> stream2Collection = stream.filter(i -> i%2 ==0).collect(Collectors.toList());
        System.out.println("==StreamToCollection==");
        stream2Collection.forEach(System.out::println);*/
        
        System.out.println("==StreamToArray==");
        Integer[] stream2Array = stream.filter(i -> i%2 ==0).toArray(Integer[]::new);
        /*for(value : stream2Array) {
            
        }*/
        System.out.println(stream2Array);
        
    }
}
