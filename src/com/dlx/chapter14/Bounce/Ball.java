package com.dlx.chapter14.Bounce;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Ball {
    private static final int Xsize=15;
    private static final int Ysize=15;
    private double x=0;
    private double y=0;
    private double dx=1;
    private double dy=1;

    public void move(Rectangle2D bounds) {
        x+=dx;
        y+=dy;
        if (x < bounds.getMinX()) {
            x = bounds.getMinX();
            dx=-dx;
        }
        if (x + Xsize >= bounds.getMaxX()) {
            x = bounds.getMaxX() - Xsize;
            dx=-dx;
        }
        if (y < bounds.getMinX()) {
            y = bounds.getMinY();
            dy = -dy;
        }
        if (y + Ysize >= bounds.getMaxY()) {
            y = bounds.getMaxY()-Ysize;
            dy=-dy;
        }
    }

    public Ellipse2D getShape(){
        return new Ellipse2D.Double(x, y, Xsize, Ysize);
    }

}
