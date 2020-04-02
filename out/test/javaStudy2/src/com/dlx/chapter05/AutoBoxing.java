package com.dlx.chapter05;

import org.omg.CORBA.IntHolder;

public class AutoBoxing {
    /**
     *  JAVA自动封装中经常出现的值包装到同一个对象中。
     *  自动封箱规范要求boolean,byte,char <128 , 介于-128~127之间的short,int 被包装到固定的对象中。
     * @param args
     */
    public static void main(String[] args) {
        Integer a=1000;
        Integer b=1000;
        Integer c=100;
        Integer d=100;
        System.out.println(a==b);
        System.out.println(c==d);
        Double dou=new Double(3.4);
        Double do123=3.4;
        System.out.println(dou==do123);
        System.out.println(dou+","+do123);

        /**
         * 因为在JAVA中  所有的参数传递都是“值传递”。
         * 而所有的数值封装类，都是final，是不可变的。
         * 所以，编写修改参数的，可以使用持有者类（holder），持有者类包含一个共有的域值。
         */
        IntHolder x=new IntHolder(3);
        add(x);
        System.out.println(x.value);

        System.out.printf("%,4d %s",new Object[]{new Integer(4444444),"wigdet"});

    }

    public static void  add(IntHolder x){
        x.value*=3;
    }

}
