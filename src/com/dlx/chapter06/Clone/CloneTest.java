package com.dlx.chapter06.Clone;

public class CloneTest implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest c=new CloneTest();
        Object clone = c.clone();
        System.out.println(clone);
        System.out.println(c);
    }
}
