package com.dlx.chapter8;

public class T<T> {

    T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public T demo1(T t){
        return t;
    }

    /* 泛型类的方法，因为无法在静态方法中确定泛型的类型，所以无法使用
    public static T demo2(T t){
        return t;
    }*/

    //这个是泛型方法，不过由于<W>的存在，可以确定W的类型，所以可以在静态方法中使用，来确定泛型的类型。
    public static <W> void demo3(W w){
        System.out.println(w + ": "+ w.getClass().getTypeName());
    }
}
