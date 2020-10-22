package com.dlx.chapter06.thisLambda;

import java.util.Comparator;

public class B  implements A ,Comparable<B>  {
    int x;
    public B(int x){
        this.x = x;
    }
    public B(){

    }

    public int getX(){return x;}


    @Override
    public int com(int a) {
        return Integer.compare(this.x, a);
    }

    @Override
    public int compareTo(B o) {
        return this.com(o.x);
    }
}
