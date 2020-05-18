package com.dlx.chapter10.GraphicsD;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class DrawTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame=new DrawFrame();
            frame.setTitle("DrawFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class DrawFrame extends JFrame{
    public DrawFrame(){
        add(new DrawComponent());
        pack();
    }
}

class DrawComponent extends JComponent{

    private static final int WIDTH=400;
    private static final int HEIGHT=400;

    @Override
    protected void paintComponent(Graphics g) {
        //自动引入了Graphics2D后，Graphics中保留了Graphics2D的信息，可以直接转化
        Graphics2D g2=(Graphics2D)g;
        double leftX=100;
        double topY=100;
        double width=200;
        double height=150;

        //因为单精度的问题，所以在几种类中有两个内部类用于存储坐标等数据，X.DOUBLE/X.FLOAT
        Rectangle2D.Double rect = new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(rect);

        Ellipse2D ellipse2D=new Ellipse2D.Double();
        ellipse2D.setFrame(rect);
        g2.draw(ellipse2D);

        g2.draw(new Line2D.Double(leftX,topY,leftX+width,topY+height));

        double centerX=rect.getCenterX();
        double centerY=rect.getCenterY();
        double radius=150;

        Ellipse2D circle=new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX,centerY,centerX+radius,centerY+radius);
        g2.draw(circle);


    }

    @Override
    public Dimension getPreferredSize() {
       return new Dimension(WIDTH,HEIGHT);
    }
}
