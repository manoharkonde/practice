package com.kmr.java.generics;

import java.util.List;

import javax.lang.model.type.NullType;
//Bounded Types
//public class GenericBounded<T extends List<Integer>> {
//Unbounded Types
public class GenericBounded<T> {
public static void main(String[] args) {
    //GenericBounded<List<Integer>> boundedList = new GenericBounded<>();
    GenericBounded<String> gb = new GenericBounded<>();
}
}
