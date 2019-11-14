package com.dlx.charater06.proxy;

import java.lang.reflect.Proxy;

public class CompanyTest {
    public static void main(String[] args)  {
        Fotile fotile = new Fotile("fotile");
        CompanyInvocationHandler handler = new CompanyInvocationHandler(fotile);
        ClassLoader classLoader = CompanyTest.class.getClassLoader();
        //因为这个类是自己的定义的，所以用的也是自定义类加载器
        //第二个参数是所调用的接口
        /*
         * newProxyInstance返回的是指定接口的代理，所以必须用接口来引用
         * */
        Company o = (Company) Proxy.newProxyInstance(classLoader, Fotile.class.getInterfaces(), handler);
        o.getName();
        System.out.println("1234");
    }
}
