package com.dlx.chapter05;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        int x = 'K';
        int xx = 'O';
        System.out.println(x + "," + xx);
        String s = "a";
        System.out.println(s.hashCode());
        Object ax = 'o';
        System.out.println(ax.hashCode());
        ArrayList<Integer> xxs = new ArrayList<>();
        xxs.ensureCapacity(100);
        Integer a=1000;
        Integer b=1000;
        System.out.println(a==b);
        Integer c=100;
        Integer d=100;
        System.out.println(c==d);
        System.out.printf("%d %s",new Object[]{new Integer(1),"sdf"});
    }
}
