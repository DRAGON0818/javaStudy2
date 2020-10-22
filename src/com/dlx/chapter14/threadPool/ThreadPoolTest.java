package com.dlx.chapter14.ThreadPool;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("enter base directory:");
            String directory = in.nextLine();
            System.out.println("Enter keyword");
            String keyword = in.nextLine();

            ExecutorService executorService = Executors.newCachedThreadPool();

            MatchCounter counter = new MatchCounter(new File(directory), keyword, executorService);
            Future<Integer> result = executorService.submit(counter);

            try {
                System.out.println(result.get() + " matching files");
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {

            }
            executorService.shutdown();

            System.out.println("largest pool size:"+((ThreadPoolExecutor)executorService).getLargestPoolSize());
        }
    }
}
