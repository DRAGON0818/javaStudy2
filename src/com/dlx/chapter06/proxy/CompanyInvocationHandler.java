package com.dlx.chapter06.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CompanyInvocationHandler implements InvocationHandler {
    //Object为Proxt代理的对象，在invoke()上为第一个参数
    private Object object;
    public CompanyInvocationHandler(Object object){
        this.object=object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Beginning");
        System.out.println("args:"+args);
        method.invoke(object,args);
        return null;
    }
}
