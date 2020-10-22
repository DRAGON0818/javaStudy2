package com.dlx.chapter06.proxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        AdminService adminService = new AdminServiceImp();
        AdminServiceProxy proxy = new AdminServiceProxy(adminService);
        proxy.update();
        System.out.println("========");
        proxy.find();
    }
}
