package com.dlx.charater06.proxy;

import java.lang.reflect.Proxy;

public class CompanyTest {
    public static void main(String[] args)  {
        Fotile fotile = new Fotile("fotile");
        CompanyInvocationHandler handler = new CompanyInvocationHandler(fotile);
        ClassLoader classLoader = CompanyTest.class.getClassLoader();
        /*
        * newProxyInstance返回的是指定接口的代理，所以必须用接口来引用
        * */

        Company o = (Company) Proxy.newProxyInstance(classLoader, Fotile.class.getInterfaces(), handler);
        o.getName();

    }
}
