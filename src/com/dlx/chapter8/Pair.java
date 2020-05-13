package com.dlx.chapter8;

import com.dlx.chapter06.Person;

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
}
