package com.dlx.chapter14.future;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTest {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter base directory (e.g. /usr/local/jdk5.0/src)");
            String directory = in.nextLine();
            System.out.println("Enter keyword (e.g. volatile):");
            String keywork = in.nextLine();

            MatchCounter counter = new MatchCounter(new File(directory), keywork);
            FutureTask<Integer> task = new FutureTask<>(counter);
            Thread t = new Thread(task);
            t.start();
            try {
                //对task.get()的调用，可能发生阻塞，直到有可获得的结果为止。
                System.out.println(task.get() + " mathing files.");
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException e) {

        }
    }
}
