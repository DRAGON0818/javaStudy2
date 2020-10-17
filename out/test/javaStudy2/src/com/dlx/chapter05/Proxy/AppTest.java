package com.dlx.chapter05.Proxy;

public class AppTest {
    public static void main(String[] args) {
        UserDao target = new UserDao();

        UserDaoProxy proxt = new UserDaoProxy(target);
        proxt.save();
    }
}
