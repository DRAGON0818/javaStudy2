package com.dlx.chapter06.ProcetedTest;

public class ObjectClass extends superClass{
    public static void main(String[] args) {
        ObjectClass o = new ObjectClass();
        o.s=3;
        System.out.println(o.s);
        superClass s=new superClass();
        System.out.println(s.s);
        System.out.println(s.getNum());
    }
}
