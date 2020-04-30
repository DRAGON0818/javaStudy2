package com.dlx.chapter06.protectedT2;

import com.dlx.chapter06.protectedT1.MyObject1;

public class MyObject2 extends MyObject1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject2 o=new MyObject2();
        o.clone();
    }
}
