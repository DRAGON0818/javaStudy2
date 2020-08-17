package com.dlx.chapter05.Proxy;

public class UserDaoProxy implements UserDaoImp{

    private UserDaoImp target;

    public UserDaoProxy(UserDaoImp target) {
        this.target=target;
    }
    @Override
    public void save() {
        System.out.println("开始事务");
        target.save();
        System.out.println("提交事务");
    }
}
