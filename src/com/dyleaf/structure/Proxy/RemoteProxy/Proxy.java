package com.dyleaf.structure.Proxy.RemoteProxy;

        import java.net.MalformedURLException;
        import java.rmi.Naming;
        import java.rmi.NotBoundException;
        import java.rmi.RemoteException;

public class Proxy implements MyRemote {
    @Override
    public String request(int money) throws RemoteException, MalformedURLException, NotBoundException {
        MyRemote remote  = (MyRemote) Naming.lookup("rmi://localhost:8888/RemoteHello");
        return remote.request(money);
    }
}
