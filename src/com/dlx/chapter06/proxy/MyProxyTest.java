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
        Double target = 2020.1024;
        Comparable<Double> proxy=(Comparable<Double>) Proxy.newProxyInstance(null,new Class[]{Comparable.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("compare completed!");
                return method.invoke(target, args);
            }
        });
        System.out.println(proxy.compareTo(new Double(1234)));
        System.out.println(proxy.compareTo(new Double(234243243)));
        System.out.println(Proxy.isProxyClass(proxy.getClass()));
    }
}
