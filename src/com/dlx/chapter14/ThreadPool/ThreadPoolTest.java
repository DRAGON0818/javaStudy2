package com.dlx.chapter14.ThreadPool;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.*;


/**
 * 执行器 Executors 有许多静态工厂方法用于构建线程池。
 * 构建一个新线程需要和系统进行交互，是有代价的。
 * 存在大量的生命周期很短的线程，应该使用线程池 ThreadPool；
 * 使用线程池 还能够减少并发线程的数量
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        try (Scanner in=new Scanner(System.in)){
            System.out.println("Enter base directory:(e.g. /usr/local/)");
            String directory = in.nextLine();
            System.out.println("Enter keyword:");
            String keyword = in.nextLine();

            ExecutorService pool = Executors.newCachedThreadPool();

            MatchCounter counter = new MatchCounter(new File(directory), keyword, pool);
            Future<Integer> result = pool.submit(counter);

            try {
                System.out.println(result.get() + " matching files");
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {

            }
            pool.shutdown();

            int largestPoolSize = ((ThreadPoolExecutor) pool).getLargestPoolSize();
            System.out.println("largest pool size="+largestPoolSize);
        }
    }
}
