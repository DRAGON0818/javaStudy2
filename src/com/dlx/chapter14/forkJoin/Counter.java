package com.dlx.chapter14.forkJoin;

import java.util.concurrent.RecursiveTask;
import java.util.function.DoublePredicate;

/**
 * Recursive   adj.   递归的，循环的
 */
public class Counter extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 1000;
    private double[] values;
    private int from;
    private int to;
    private DoublePredicate filter;

    public Counter(double[] values, int from, int to, DoublePredicate filter) {
        this.values = values;
        this.filter = filter;
        this.from = from;
        this.to = to;
    }

    @Override
    protected Integer compute() {
        if (to - from < THRESHOLD) {
            int count=0;
            for (int i = from;i<to;i++ ) {
                if(filter.test(values[i])) count++;
            }
            return count;
        }
        else{
            int mid = (from + to) / 2;
            Counter first = new Counter(values, from, mid, filter);
            Counter second = new Counter(values, mid, to, filter);
            invokeAll(first, second);
            return first.join() + second.join();
        }
    }
}
