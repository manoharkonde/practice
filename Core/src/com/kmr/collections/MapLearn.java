package com.kmr.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapLearn {
public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("mano", 30);
    map.put("pandu", 14);
    map.put("nani",16);
    map.put("chinni", 24);
    System.out.println("Map Objs: "+map);
    System.out.println("Map keys: "+map.keySet());
    System.out.println("Map Values: "+map.values());
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println("Key: "+entry.getKey()+"--"+"Value: "+entry.getValue());
    }
    
    Hashtable ht = new Hashtable<>();
    ht.put(10, 11);
    ht.put(10, 11);
    ht.put(13, 15);
    System.out.println(ht);
}
}
