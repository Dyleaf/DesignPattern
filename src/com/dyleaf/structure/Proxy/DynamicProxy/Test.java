package com.dyleaf.structure.Proxy.DynamicProxy;

import com.dyleaf.structure.Proxy.StaticProxy.UserDao;
import com.dyleaf.structure.Proxy.StaticProxy.UserDaoImpl;

public class Test {
    public static void main(String[] args) {
        UserDao target = new UserDaoImpl();
        System.out.println(target.getClass());

        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());

        proxy.save();
    }
}
