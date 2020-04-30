package com.dlx.chapter8.Block869;

import java.io.File;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        new Block(){
            @Override
            public void body() throws Exception {
                System.out.println(this.getClass().getName());
                Scanner in = new Scanner(new File("uuuu.txt"),"UTF-8");
                while(in.hasNext()){
                    System.out.println(in.next());
                }
            }
        }.doThread().start();
    }
}
