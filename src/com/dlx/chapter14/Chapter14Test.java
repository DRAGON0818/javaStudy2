package com.dlx.chapter14;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

public class Chapter14Test {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        thread.interrupt();
        System.out.println(thread.isInterrupted());
        try {
            Thread.sleep(5);//Thread.sleep()方法会重置interrupt状态
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.isInterrupted());
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("map", 3);
        /**
         * map.replace（map,oldValue,newValue）,map中存在key，并且相关的"值"和oldValue相等，才可以替换成新值。
         */
        map.replace("map", 0, 20);
        Integer map1 = map.get("map");
        System.out.println(map1);


        int[] values = new int[100];
        Arrays.parallelSetAll(values, i -> i % 10);
        System.out.println(Arrays.toString(values));

        int[] b=new int[]{1,2,3,4,5,6,7,8,9};
        Arrays.parallelPrefix(b,(x,y)->x*y);
        System.out.println(Arrays.toString(b));
    }
}
