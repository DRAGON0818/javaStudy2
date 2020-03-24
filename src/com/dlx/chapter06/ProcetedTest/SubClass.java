package com.dlx.chapter06.ProcetedTest;

import com.dlx.chapter06.Super;

public class SubClass extends Super {
    protected  void protectedFunction(){
        System.out.println("1234");
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        SubClass subClass=new SubClass();
        subClass.publicFunction();
        subClass.protectedFunction();
        Object clone = subClass.clone();

//        Super s=new SubClass();
//        s.protectedFunction();
//        s.publicFunction();
//
//        Super xx=new Super();
//        xx.publicFunction();
//        xx.protectedFunction();
    }
}
