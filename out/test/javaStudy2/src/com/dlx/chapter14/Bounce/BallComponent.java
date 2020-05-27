package com.dlx.chapter14.Bounce;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BallComponent extends JPanel {
    private static final int WIDTH=450;
    private static final int HEIGHT=350;

    List<Ball> balls = new ArrayList<>();

    public void add(Ball b){
        balls.add(b);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);//erase background 清空背景板
        Graphics2D g2=(Graphics2D)g;
        for (Ball b : balls) {
            g2.fill(b.getShape());
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }
}
