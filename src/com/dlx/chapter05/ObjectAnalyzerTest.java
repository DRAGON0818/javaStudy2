package com.dlx.chapter05;

import java.util.ArrayList;

public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares=new ArrayList<>();
        for(int i=1;i<5;i++) {
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
        System.out.println(new StringBuffer("new"));
      //  System.out.println(new ObjectAnalyzer().toString(new int[]{1,2,3,4}));

    }
}
