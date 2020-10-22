package com.dlx.chapter06.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        System.out.println("=== 方法一 ===");
        AdminService adminService = new AdminServiceImp();
        System.out.println("代理的目标对象: " + adminService.getClass());

        //获得代理对象的处理器
        AdminServiceInvocation adminServiceInvocation = new AdminServiceInvocation(adminService);
        //获得代理对象
        AdminService proxy = (AdminService) new AdminServiceDynamicProxy(adminService, adminServiceInvocation).getPersonProxy();
        System.out.println("代理对象 : " + proxy.getClass());

        Object find = proxy.find();
        System.out.println("find 返回对象 : " + find.getClass());
        System.out.println("=================");
        proxy.update();


        System.out.println("=== 方法二 ===");
        AdminServiceImp target = new AdminServiceImp();
        AdminServiceInvocation invocation = new AdminServiceInvocation(target);
        AdminService proxy1 = (AdminService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocation);
        System.out.println("代理对象 : " + proxy1.getClass());

        Object object2 = proxy1.find();
        System.out.println("find 返回对象 ：" + object2.getClass());
        System.out.println("=================");
        proxy1.update();

        System.out.println("=== 方法三 ===");
        final AdminService target3 = new AdminServiceImp();
        AdminService proxy3= (AdminService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("判断用户是否有权进行操作");
                Object object = method.invoke(target, args);
                System.out.println("记录用户执行操作的时间、更改内容和时间等");
                return object;
            }
        });

        Object object3 = proxy3.find();
        System.out.println("find返回对象: " + object3.getClass());
        System.out.println("===============");
        proxy3.update();

    }
}
