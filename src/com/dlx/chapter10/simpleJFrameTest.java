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

            SimpleJFrame jFrame=new SimpleJFrame();
            //可以让窗口系统控制窗口的位置    setLocationByPlatform()方法
            jFrame.setLocationByPlatform(true);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setVisible(true);
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
