package com.dlx.chapter06.proxy;
//封装好的实现类，作为目标对象
public class AdminServiceImp implements AdminService{
    @Override
    public void update() {
        System.out.println("修改管理系统数据");
    }

    @Override
    public Object find() {
        System.out.println("查找管理系统数据");
        return new Object();
    }
}
