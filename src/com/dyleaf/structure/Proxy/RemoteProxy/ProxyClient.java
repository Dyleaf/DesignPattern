package com.dyleaf.structure.Proxy.RemoteProxy;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class ProxyClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        MyRemote proxy = new Proxy();
        System.out.println(proxy.request(100));
    }
}
