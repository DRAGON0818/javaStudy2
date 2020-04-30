package com.dlx.chapter06.protectedT1;

public class MyObject1 implements Cloneable{
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("MyObject1 ' s protected method");
        return super.clone();
    }
}
