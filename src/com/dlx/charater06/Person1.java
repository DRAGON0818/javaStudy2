package com.dlx.charater06;

import java.awt.*;

public class Person1  {
    private String name;
    Person1(){

    }
    Person1(String name){
        this.name=name;
    }

    public void get(Object object){
        System.out.println("1234");
    }
    public String getName(){
        return this.name;
    }
}
