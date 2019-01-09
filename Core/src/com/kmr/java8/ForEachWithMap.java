package com.kmr.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachWithMap {
public static void main(String[] args) {
    
    Map<String, Integer> map = new HashMap<>();
    map.put("mano", 12);
    map.put("Chinni", 18);
    map.put("pandu", 12);
    map.put("nani",14);
    
//    for(Map.Entry<String, Integer> entry: map.entrySet()){
//        System.out.println(entry.getKey()+"=="+entry.getValue());
//    }
    
   // map.forEach((String, Integer)->System.out.println(String+Integer));
    
    List<String> items = new ArrayList<String>();
    items.add("A");
    items.add("c");
    items.add("D");
    items.add("E");
    
    items.forEach(item->System.out.println(item));
    
    items.forEach(item -> {
    if("c".equals(item)) {
        System.out.println(item);
    }
    });
    
    System.out.println("==filter with stream==");
    
    items.stream().filter(f->f.contains("E")).forEach(System.out::println);;
}
}
