package com.kmr.java.delarationandaccessmodifiers;

//import java.util.Date;
import java.sql.Date;

//import com.kmr.java.other.Date;
public class JavaSourceFileStructure {
public static void main(String[] args) throws Throwable {
    Date date = new Date(1);
    JavaSourceFileStructure jsf= new JavaSourceFileStructure();
    jsf.finalize();
    System.out.println("Another class main mehtod: "+date.getClass().getPackage());
    date = null;
    jsf= null;
    System.gc();
}
@Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method");
    }
}

class AnotherOne {
    /*public static void main(String[] args) {
        System.out.println("AnotherOne class main method.");
    }*/
}
class AnotherTwo {
    
}
