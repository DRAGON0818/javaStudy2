package com.dlx.chapter11.MousFrame;

import javax.swing.*;

public class MouseFrameTest  {
    public static void main(String[] args) {
        MouseFrame frame = new MouseFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setName("Mouse");
    }
}

class MouseFrame extends JFrame{
    public MouseFrame(){
        add(new MouseConponent());
        pack();
    }
}
