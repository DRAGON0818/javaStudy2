package com.dlx.chapter14.ThreadLocal;

import java.text.SimpleDateFormat;

public class ThreadLocalClass {
    //因为SimpleFormat是不安全的，simpledataformat的内部数据结构可能被并发访问破坏。
    public static final SimpleDateFormat simpledataformat = new SimpleDateFormat("yyyy-MM-dd");
    //为了避免多线程造成的数据结构被破坏，【为各个线程构建一个数据实例    ThreadLocal<?>.withInitial<Supplier<? entends S> supplier>】。
    public static final ThreadLocal<SimpleDateFormat> dataFormat =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));


    /**
     * 为什么禁用stop/suspend方法
     * 1.stop 终止一个线程，容易破坏数据
     * 2.suspend用于挂起一个线程，容易引起有锁的线程被挂起，而其他线程需要获得锁，造成死锁。
     */

}
