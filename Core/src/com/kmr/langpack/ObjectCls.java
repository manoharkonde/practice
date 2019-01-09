package com.kmr.langpack;

public class ObjectCls extends ObjectSuper {
    
public static void main(String[] args) {
    ObjectCls objCls = new ObjectCls();
    ObjectCls objCls2 = new ObjectCls();
    System.out.println("With out toString: "+objCls);
    //hard coded hashCode in ObjectSuper.
    System.out.println("1st time hashCode: "+objCls.hashCode());
    System.out.println("2nd time call hashCode: "+objCls.hashCode());
    System.out.println("objCls2 hashCode: "+objCls2.hashCode());
    
}
@Override
    public String toString() {
        return "ObjectCls Own toString";
    }
/*@Override
    public int hashCode() {
        return super.hashCode();
    }*/
}
