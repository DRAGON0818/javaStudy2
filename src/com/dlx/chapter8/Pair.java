package com.dlx.chapter8;

import com.dlx.chapter06.Person;

import java.util.ArrayList;
import java.util.function.Supplier;

//定义一个泛型类
public class Pair<T> {
    public T first;
    public  T second;

    public Pair(){
        first=null;
        second=null;
    }

    public Pair(T first,T second){
        this.first=first;
        this.second=second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public static void printBuddies(Pair<? extends Person> pair){

    }

    public static <T> Pair<T> makePair(Supplier<T> constr) {
        System.out.println(constr.get());
        return new Pair<>(constr.get(), constr.get());
    }

}
