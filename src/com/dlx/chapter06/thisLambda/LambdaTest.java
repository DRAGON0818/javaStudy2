package com.dlx.chapter06.thisLambda;

import java.util.Arrays;

import static java.util.Arrays.*;

public class LambdaTest {
    public static void main(String[] args) {
        String[] a = new String[]{"donglxa", "dengchu", "zhaoyan", "achu", "chu", "liu"};
        sort(a,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(a));
        sort(a,(x,y)->{
            return x.compareToIgnoreCase(y);
        });
        GreatTest g = new GreatTest();
        g.say1();
    }
}
