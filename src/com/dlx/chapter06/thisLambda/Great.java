package com.dlx.chapter06.thisLambda;

import java.awt.event.ActionEvent;

public class Great {
    public void say(ActionEvent event){
        System.out.println("Greeting !");
    }
    public void toString(String e){
        System.out.println(" ++"+toString()+"@@@");
    }

    public void toString(ActionEvent event) {
        System.out.println("1234");
    }
}
