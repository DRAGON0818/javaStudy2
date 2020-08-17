package com.dlx.chapter05.Proxy;

public class UserDao implements UserDaoImp{
    @Override
    public void save() {
        System.out.println("保存数据成功");
    }
}
