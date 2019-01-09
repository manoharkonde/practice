package com.kmr.java8;

@FunctionalInterface
public interface FuncInterface {
public void singleMethod();
//public void secondMethod();

default void doSomeMoreWork1(){
  //Method body
  }
  default void doSomeMoreWork2(){
  //Method body
  }
}
