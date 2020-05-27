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
//        Thread.currentThread().interrupt();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("!234");
//        Thread.interrupted();
    }
}
