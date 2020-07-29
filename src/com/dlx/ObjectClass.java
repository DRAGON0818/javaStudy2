package com.dlx;

import com.dlx.chapter06.ProcetedTest.superClass;

public class ObjectClass extends superClass {
    public static void main(String[] args) {
        ObjectClass o = new ObjectClass();
        System.out.println(o.s);
        superClass s=new ObjectClass();
        System.out.println(o.getNum());
    }
}
