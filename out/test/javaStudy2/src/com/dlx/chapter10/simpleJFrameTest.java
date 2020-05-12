package com.dlx.chapter10;

import javax.swing.*;
import java.awt.*;

public class simpleJFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            SimpleJFrame simpleJFrame = new SimpleJFrame();
           // simpleJFrame.setUndecorated(true);
            simpleJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            simpleJFrame.setVisible(true);
        });
    }
}

class SimpleJFrame extends JFrame{
    public static final int X=300;
    public static final int Y=200;

    public SimpleJFrame(){
        setSize(X,Y);
    }
}
