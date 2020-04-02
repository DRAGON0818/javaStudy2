package com.dlx.chapter05.Reflection;

import com.dlx.chapter05.AutoBoxing;

import java.util.Random;

public class Classclass {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        AutoBoxing autoBoxing=new AutoBoxing();
        /**
         * Object类中的getClass()方法将会返回一个Class类型的实例。虚拟机为每个类型管理一个Class对象
         * 获得Class对象的三种方法：
         * 1.对象.getClass();
         * 2.Class.forName(ClassName);
         * 3.T.class;
         */
        Class<? extends AutoBoxing> aClass = autoBoxing.getClass();
        System.out.println(aClass.getName());

        Class<?> bClass = Class.forName("java.util.Random");

        /*一个CLass对象实际上表示的是一个类型，而这个类型不一定是一个类  例如基础数据类型*/
        Class cClass=int.class;

        /**
         * 可以在运行时，动态创建不同类型的对象，Class.newInstance()，返回的是一个Object对象。
         * 这个方法只能够调用类的默认的构造函数（即没有参数的构造函数），如果没有这个函数，就会报错。
         * 如果需要使用有参数的构造函数，那么应该用Construction类中的newInstance方法。
         */
        Object newInstance = Class.forName("java.util.Random").newInstance();
        Random random = (Random) newInstance;
        int nextInt = random.nextInt(400);
        System.out.println(nextInt);
    }
}
