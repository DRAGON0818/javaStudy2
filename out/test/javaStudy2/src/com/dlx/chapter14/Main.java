package com.dlx.chapter14;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<String> myCallable=new Callable<String>(){

            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                System.out.println("call方法执行了");
                return "call 方法返回值"+Thread.currentThread().getName();
            }
        };

        System.out.println("提交任务之前"+getStringDate());
        //线程池通过submit提交一个Callable，并且返回一个Future，通过Future.get()获得返回值。
        //任务在submit的时候，已经开始执行  如果在get的时候，任务已经执行完毕  则不会发生堵塞
        //submit方法的异常，会在主程序中catch到
        Future<String> submit = executorService.submit(myCallable);
        System.out.println("提交任务之后，获得结果之前"+getStringDate());
        System.out.println("获得返回值" + submit.get(3,TimeUnit.SECONDS));
        System.out.println("获取到结果之后" + getStringDate()+" "+Thread.currentThread().getName());
    }

    public static String getStringDate(){
        Date currentTime = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String format = simpleDateFormat.format(currentTime);
        return format;
    }

}

