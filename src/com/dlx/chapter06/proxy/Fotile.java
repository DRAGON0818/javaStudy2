package com.dlx.chapter06.proxy;

public class Fotile implements Company{
    private String name;
    public Fotile(String name){
        this.name=name;
    }
    public Fotile(){}
    public void setName(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
