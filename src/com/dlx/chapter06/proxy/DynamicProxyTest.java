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

        proxy.find();
        proxy.update();


        System.out.println("=== 方法二 ===");
        AdminServiceImp target = new AdminServiceImp();
        AdminServiceInvocation invocation = new AdminServiceInvocation(target);
        AdminService proxy1 = (AdminService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocation);
        System.out.println("代理对象 : " + proxy1.getClass());

        proxy1.find();
        proxy1.update();

        System.out.println("=== 方法三 ===");
        final AdminService target3 = new AdminServiceImp();
        AdminService proxy3= (AdminService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("*****************" + method.getName()+ "*******************");
                System.out.println("proxy : "+proxy.getClass().getName());//这是个回掉函数，此时并没有proxy实例，所以print(proxy)报错
                System.out.println("判断用户是否有权进行操作");
                Object object = method.invoke(target3, args);
                System.out.println("记录用户执行操作的时间、更改内容和时间等");
                return object;
            }
        });

        proxy3.find();
        proxy3.update();

    }
}
