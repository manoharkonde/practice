package com.kmr.langpack;

public class ObjectSuper {
@Override
public int hashCode() {
    
    return 1001;
}
public static void main(String[] args) {
    ObjectSuper obj= new ObjectSuper();
    System.out.println(obj.hashCode());
}
}
