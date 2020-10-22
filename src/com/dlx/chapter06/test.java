package com.dlx.chapter06;

import java.lang.reflect.Method;

public class test {
    public static void main(String[] args) {
        /*Temp temp=new Temp();
        System.out.println(temp.getName());

         */
        Class<? extends Person2> aClass = new Person2().getClass();
        Method[] methods =
                aClass.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        Person2 p = new Person2();
        p.H();
        
    }
}
