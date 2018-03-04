package structure.Proxy.StaticProxy;

public class Test {

    public static void main(String[] args) {
        UserDao target = new UserDaoImpl();
        //建立代理关系
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
    }

}
