package com.kmr.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorLearn {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>(new MyComparator());
        ts.add(34);
        ts.add(22);
        ts.add(15);
        ts.add(60);
        ts.add(53);
        System.out.println(ts);
    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
      Integer i1 = (Integer)obj1;
      Integer i2 = (Integer)obj2;
      if(i1<=i2){
          return 1;
      }
      else if(i1>=i2){
          return -1;
      }else
        return 0;
    }
}
