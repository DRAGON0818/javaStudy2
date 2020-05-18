package com.dlx.chapter06.defaultImp;

/**
 * ImpTet同时实现了两个接口，这两个接口有一个相同签名的函数
 * 1.将类指定为抽象类
 * 2.实现冲突的函数。
 */
public class ImpTet implements Named,Person{
    @Override
    public String getName() {
        return null;
    }
}
