package com.dlx.chapter05.Proxy;

public class ProxyTestApp {
    public static void main(String[] args) {
        //目标对象
        UserDaoImp target = new UserDao();
        //原始类型
        System.out.println(target.getClass());
        //给目标对象，创建代理对象
        UserDaoImp proxy = (UserDaoImp) new ProxyFactory(target).getProxyInstance();
        //class &proxy0  内存中动态生成的代理对象
        System.out.println(proxy.getClass());
        //【代理对象】执行方法
        proxy.save();
    }
}
