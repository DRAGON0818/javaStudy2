package com.dlx.charater06;

public class RunnableTest  {

    public static void repeat(int x, Runnable runnable) {
        for (int i = 0; i < x; i++){
            runnable.run();
        }
    }
}
