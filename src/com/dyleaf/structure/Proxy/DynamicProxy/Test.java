package structure.Proxy.DynamicProxy;

import structure.Proxy.StaticProxy.UserDao;
import structure.Proxy.StaticProxy.UserDaoImpl;

public class Test {
    public static void main(String[] args) {
        UserDao target = new UserDaoImpl();
        System.out.println(target.getClass());

        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());

        proxy.save();
    }
}
