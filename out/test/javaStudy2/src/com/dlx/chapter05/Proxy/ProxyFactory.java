package com.dlx.chapter05.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    //存储目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    //是利用JDK的API,动态的在内存中创建代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Begining");
                        Object returnValue = method.invoke(target, args);
                        System.out.println("End");
                        return returnValue;
                    }
                });
    }
}
