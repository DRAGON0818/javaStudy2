package com.dlx.charater07.ExceptionTest;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SubException extends SuperException{
    @Test
    void test(){
        try {
            SuperException();
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void SuperException()  {
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream("a.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } finally {
            System.out.println("没有catch()");
        }
    }
}
