package com.dlx.chapter06.protectedT1;

import com.dlx.chapter06.protectedT2.H2;

public class H1 implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        H2 H=new H2();
        System.out.println(H);
        System.out.println(H.clone());
        final  String salu="Hello";

        Greeting greeting=new Greeting() {
            @Override
            public void sayMessage(String message) {
                System.out.println(salu+message);
            }
        };
        // Greeting greeting=message -> System.out.println(salu+message);
        greeting.sayMessage("  Runbo");
    }

    interface Greeting{
        void sayMessage(String message);
    }
}

