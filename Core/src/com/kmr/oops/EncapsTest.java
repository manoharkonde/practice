package com.kmr.oops;

import java.util.ArrayList;


public class EncapsTest {
public static void main(String[] args) {
    Parent p = new Child();
    p.parentMeth();
    Child c = new Child();
    c.childMeth();
    c.parentMeth();
}
}
