package com.dlx.chapter06.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 个人理解：
 * 代理的原理就是利用JVM自动带运行创建实现了指定接口的代理实现类。
 */
public class MyProxyTest {
    public static void main(String[] args) {
        Integer target=4;
        Comparable object = (Comparable)Proxy.newProxyInstance(null, new Class[]{Comparable.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Proxy : " + proxy.getClass().getName());
                return method.invoke(target, args);
            }
        });
        System.out.println(object.compareTo(40));
        System.out.println("*********************");
        System.out.println(object.compareTo(3));
    }
}
