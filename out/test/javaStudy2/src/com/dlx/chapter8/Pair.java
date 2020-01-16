package com.dlx.chapter8;

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
}
