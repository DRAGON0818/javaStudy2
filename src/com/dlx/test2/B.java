package com.dlx.test2;

import com.dlx.test1.A;

public class B extends A {

    public static void main(String[] args) throws CloneNotSupportedException {
        B b=new B();
        b.a();
        Object x=b.clone();
        System.out.println(x);
    }
}
