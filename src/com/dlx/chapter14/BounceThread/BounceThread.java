package com.dlx.chapter14.BounceThread;
import javax.swing.*;
import java.awt.*;

public class BounceThread {
    public static void main(String[] args)  {
        EventQueue.invokeLater(()->{
            JFrame frame = new BounceFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
