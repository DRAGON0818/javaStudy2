package com.dlx.chapter14;

public class Chapter14Test {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        thread.interrupt();
        System.out.println(thread.isInterrupted());
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.isInterrupted());
    }
}
