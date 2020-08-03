package com.dlx.chapter06.protectedT1;

import com.dlx.chapter06.ProcetedTest.superClass;

public class ObjectClass extends superClass {
    public ObjectClass() {
    }

    public String to_say(int x,int y ,int z){
        char c1;
        try {
            c1 = 'z';
            return "22222";
        } catch (Exception e) {
            c1 = 'b';
            return "3333";
        }
    }

    public static void main(String[] args) {
        ObjectClass o = new ObjectClass();
        System.out.println(o.x);
    }
}
