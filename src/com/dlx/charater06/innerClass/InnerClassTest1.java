package com.dlx.charater06.innerClass;

public class InnerClassTest1 {
    public static void main(String[] args) {
        Temp a=new Temp();
        Temp b=new Temp();
        a.sout();
        a.x++;
        a.sout();
        b.sout();
        System.out.println(a.x==b.x);
    }
    static class Temp{
        public static int x=20;
        public void sout(){
            System.out.println(x);
        }
    }
}


