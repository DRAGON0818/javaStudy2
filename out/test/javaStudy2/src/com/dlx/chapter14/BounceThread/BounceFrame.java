package com.dlx.chapter14.BounceThread;

import com.dlx.chapter14.Bounce.Ball;
import com.dlx.chapter14.Bounce.BallComponent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BounceFrame extends JFrame{
    private BallComponent comp;
    public static final int STEPS=1000;
    public static final int DELAY=5;

    public BounceFrame(){
        setTitle("Bounce");
        comp = new BallComponent();
        add(comp, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButon(buttonPanel, "Start", e -> addBall());
        addButon(buttonPanel, "Close", e -> System.exit(0));
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
    }

    public void addButon(Container c, String title, ActionListener listener) {
        JButton jButton = new JButton(title);
        c.add(jButton);
        jButton.addActionListener(listener);
    }

    public void addBall()  {
        Ball ball=new Ball();
        comp.add(ball);
        Runnable r=()->{
            for (int i = 0; i < STEPS; i++) {
                ball.move(comp.getBounds());
                comp.repaint();
                try {
                    Thread.sleep(DELAY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
