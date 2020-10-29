package com.dlx.chapter8;

import org.junit.Test;

import java.lang.reflect.Field;

class TypeTest<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class Type<T extends Number>{
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class test1{
    @Test
    public void test(){
        TypeTest<Integer> test = new TypeTest<>();
        test.setT(12);
        Class<? extends TypeTest> aClass = test.getClass();
        for (Field f : aClass.getDeclaredFields()) {
            System.out.println(f.getName() + ": " + f.getType());
        }

        Type<Integer> t = new Type<>();
        t.setT(24);
        for (Field f : t.getClass().getDeclaredFields()) {
            System.out.println(f.getName() + ": " + f.getType());
        }

        Type<Integer> i = new Type<>();
        i.setT(2);
        Type<? extends Integer> x = new Type<>();
        for (Field f : i.getClass().getDeclaredFields()) {
            System.out.println(f.getName() + ": " + f.getType());
        }

        for (Field f : x.getClass().getDeclaredFields()) {
            System.out.println(f.getName() + ": " + f.getType());
        }

        System.out.println(i.getClass().isInstance(x.getClass()));
    }
}
