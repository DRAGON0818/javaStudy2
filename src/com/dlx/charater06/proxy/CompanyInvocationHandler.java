package com.dlx.charater06.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CompanyInvocationHandler implements InvocationHandler {
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
