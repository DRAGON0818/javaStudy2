package com.dlx;

public class ObjectClass implements Cloneable{
    public ObjectClass() {
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClass o = new ObjectClass();
        System.out.println(o.clone());
    }
}
