package Struct.Proxy.RemoteProxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    @Override
    public String request(int money) throws RemoteException, MalformedURLException, NotBoundException {
        System.out.println("充值" + money + "元话费成功");
        return "充值成功";
    }

    public MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) {
        try {
            // 产生远程对象
            MyRemote service = new MyRemoteImpl();

            // 注册远程访问接口
            LocateRegistry.createRegistry(8888);

            // 注册远程对象，注册名为RemoteHello，代理访问时指定这个名称就可以找到本类，
            Naming.rebind("rmi://localhost:8888/RemoteHello",service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
