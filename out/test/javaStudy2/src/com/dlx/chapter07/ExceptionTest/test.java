package com.dlx.chapter07.ExceptionTest;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        //<span style="font-family: Arial, Helvetica, sans-serif;">方法1：</span><span style="font-family: Arial, Helvetica, sans-serif;">查看堆栈中的文本信息</span>
//        Throwable t= new Throwable();
//        StringWriter out=new StringWriter();
//        t.printStackTrace(new PrintWriter(out));
//        System.out.println(out.toString());

        //<span style="font-family: Arial, Helvetica, sans-serif;">方法2：</span><span style="font-family: Arial, Helvetica, sans-serif;">查看堆栈跟踪元素</span>
        Throwable t = new Throwable();
        StackTraceElement[] elements=t.getStackTrace();

        for(StackTraceElement element:elements){
            System.out.println("堆栈信息："+element.toString());
        }

//        //<span style="font-family: Arial, Helvetica, sans-serif;">方法3：</span><span style="font-family: Arial, Helvetica, sans-serif;">查看所有线程堆栈的跟踪信息</span>
//        Map<Thread, StackTraceElement[]> stacksMap=Thread.getAllStackTraces();
//
//        for(Thread t:stacksMap.keySet()){
//            StackTraceElement[] elements = stacksMap.get(t);
//            for(StackTraceElement element:elements){
//                System.out.println("堆栈信息："+element.toString());System.out.println("堆栈信息："+element.toString());
//            }
//        }
    }
}
