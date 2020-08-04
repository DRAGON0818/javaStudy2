package com.dlx;

import com.dlx.chapter06.ProcetedTest.superClass;

public class ObjectClass extends superClass implements Cloneable{
    public ObjectClass() {
    }

    public static void main(String[] args) {
        ObjectClass o = new ObjectClass();
        System.out.println(o.x);
        superClass s=new ObjectClass();
        System.out.println(o.getNum());
    }
}
