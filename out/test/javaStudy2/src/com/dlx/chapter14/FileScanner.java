package com.dlx.chapter14;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileScanner {
    private static void listFile(File f) throws InterruptedException {
        if(f == null) {
            throw new IllegalArgumentException();
        }
        if(f.isFile()) {
            System.out.println(f);
            return;
        }
        File[] allFiles = f.listFiles();
        Thread.currentThread().interrupt();
        /*if(Thread.interrupted()) {
            throw new InterruptedException("文件扫描任务被中断1");
        }*/
        for(File file : allFiles) {
            //还可以将中断检测放到这里
            if(Thread.interrupted()) {
                throw new InterruptedException("文件扫描任务被中断2");
            }
            listFile(file);
        }
    }

    public static String readFromConsole() {
        System.out.println("input:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void main(String[] args) throws Exception {
        final Thread fileIteratorThread = new Thread() {
            public void run() {
                try {
                    System.out.println("输入路径：");
                    Scanner in = new Scanner(System.in,"UTF-8");
                    listFile(new File(in.nextLine()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t=new Thread() {
            public void run() {
                while(true) {
                    if(!"quit".equalsIgnoreCase(readFromConsole())) {
                        if(fileIteratorThread.isAlive()) {
                            fileIteratorThread.interrupt();
                            return;
                        }
                    } else {
                        System.out.println("输入quit退出文件扫描");
                    }
                }
            }
        };
        fileIteratorThread.start();
        t.start();
    }
}
