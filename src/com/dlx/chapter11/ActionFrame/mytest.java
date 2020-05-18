package com.dlx.chapter11.ActionFrame;

import javax.swing.*;

public class mytest {
    public static void main(String[] args) {
        MyAction2 myAction2 = new MyAction2();
        myAction2.setSize(300, 200);
        myAction2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myAction2.setVisible(true);
    }
}
