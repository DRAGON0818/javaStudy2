package com.dlx.chapter14.future;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class MatchCounter implements Callable<Integer> {
    private File directory;
    private String keyword;

    public MatchCounter(File directory, String keyword) {
        this.directory=directory;
        this.keyword = keyword;
    }
    @Override
    public Integer call() throws Exception {
        int count=0;
        try {
            File[] files = directory.listFiles();
            /*
             * Future保存异步计算的结果。可以启动一个计算，将Future对象交给某个线程，等待计算结束后，Future获得计算结果。
             */
            List<Future<Integer>> results = new ArrayList<>();

            for (File file : files) {
                if (file.isDirectory()) {
                    MatchCounter matchCounter = new MatchCounter(file, keyword);
                    //FutureTask包装器，可以把Callable转换成Future和Runnable，同时完成了二者的接口；因为需要启动线程，new Thread(Runnable)  所以用到了FutureTask对象
                    FutureTask<Integer> task = new FutureTask<Integer>(matchCounter);
                    results.add(task);
                    Thread thread = new Thread(task);
                    thread.start();
                } else {
                    if (search(file)) {
                        count++;
                    }
                }
            }

            for (Future<Integer> result : results) {
                try {
                    count += result.get();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {

        }
        return count;
    }

    public boolean search(File file) {
        try {
            try (Scanner in = new Scanner(file, "UTF-8")) {
                boolean found = false;
                while (!found && in.hasNext()) {
                    String s = in.nextLine();
                    if (s.contains(keyword)) {
                        found = true;
                    }
                }
                return found;
            }
        } catch (IOException e) {
            return false;
        }
    }
}
