package com.dlx.chapter07.ExceptionTest;


import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyTest {

    @Test
    public void test(){
        doSth();
    }

    public void doSth(){
        try{
            String path="C:\\a.txt";
            Open(path);
        }catch (Throwable e){
            System.out.println(e.getMessage());
            Throwable cause = e.getCause();
            System.out.println("in");
            cause.printStackTrace();
            System.out.println("out");
        }
    }

    public void Open(String path) throws Throwable {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            /**
             * 将原始异常包装为更通用的异常的“原因”。
             * TIP:如果一个方法中发生了一个“受查异常”，而不允许抛出异常，那么可以捕获这个异常，包装成“运行时异常”。
             */
            Throwable se=new FileNotFoundException("something error");
            se.initCause(e);
            /**
             * 在函数中throw跑出了一个异常，要么在这个函数中捕获它，进行处理，或者直接在函数声明中抛出这个异常，交给调用的函数或者异常处理器处理。
             */
           throw se;
        }
    }
}
