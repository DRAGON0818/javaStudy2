package com.dlx.chapter05;

import java.util.ArrayList;

public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares=new ArrayList<>();
        for(int i=1;i<6;i++) {
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
        System.out.println(new ObjectAnalyzer().toString(new int[]{1,2,3,4}));




       /* int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Class<? extends int[]> aClass = a.getClass();
        System.out.println(aClass.getComponentType());
        System.out.println(aClass.getComponentType().isPrimitive());*/

    }
}
