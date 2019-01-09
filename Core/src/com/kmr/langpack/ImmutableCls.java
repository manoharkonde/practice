package com.kmr.langpack;

final class ImmutableCls {
private int i;
ImmutableCls(int i) {
    this.i = i;
}

public ImmutableCls modify(int i) {
    if(this.i == i){
        return this;
    }
    else return new ImmutableCls(i);
}
public static void main(String[] args) {
    ImmutableCls imut = new ImmutableCls(25);
    ImmutableCls imut2 = imut.modify(25);
    ImmutableCls imut3 = imut.modify(50);
    System.out.println(imut==imut2);
    System.out.println(imut2==imut3);
}
}
