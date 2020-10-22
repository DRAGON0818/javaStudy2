package com.dlx.chapter06.thisLambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreatTest extends Great{
    GreatTest(){
       super.toString("1234");
    }

    public void say1(){
        Timer t=new Timer(1000,super::toString);
        t.start();
    }

    public static void main(String[] args) {
        Great t=new GreatTest();
        System.out.println(t.toString());
    }
}
