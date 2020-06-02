package com.dlx.chapter14;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;

public class Test {
    private static Object lock = new Object();
    public static AtomicLong nextNumber = new AtomicLong();

    public static void main(String[] args) throws InterruptedException{
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                synchronized (lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run(){
                synchronized (lock){
                    System.out.println("hello");
                }
            }
        };
        thread1.start();
        thread2.start();

        Thread.sleep(2000);

        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

        for(int i=0;i<20;i++)
        {
            long id = nextNumber.incrementAndGet();
            System.out.println(id);
        }

        LongAccumulator adder = new LongAccumulator(Long::sum, 0);
        adder.accumulate(21);
        System.out.println(adder.get());
    }
}