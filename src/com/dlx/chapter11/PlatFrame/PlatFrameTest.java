package com.dlx.chapter11.PlatFrame;

import javax.swing.*;
import java.awt.*;

public class PlatFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            JFrame frame=new PlatFrame();
            frame.setTitle("LookAndFeel");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
