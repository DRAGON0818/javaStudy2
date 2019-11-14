package com.dlx.charater07.Exception;

import javax.swing.*;
import java.io.FileInputStream;

public class Exception1 {
    public static void main(String[] args) {


    }

    public void readData(String path) throws Exception {
        byte[] b=new byte[1024];
        int len=0;
        FileInputStream fileInputStream = new FileInputStream(path);
        while((len=fileInputStream.read(b))!=-1){
            throw new Exception("Here are some wrongs");//可以自定义报错信息，如果只是在函数声明的时候抛出异常，只会显示在堆栈中的异常信息。
        }
    }
}
