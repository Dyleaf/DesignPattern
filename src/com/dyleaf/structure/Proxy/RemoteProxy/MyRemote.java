package com.dyleaf.structure.Proxy.RemoteProxy;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *@Author dyleaf
 *@Description: 之前没见过的java的分布式的例子
 *@Date: 11:17 2018/3/3
 */
public interface MyRemote extends Remote {
    public String request(int money) throws RemoteException,MalformedURLException,NotBoundException;
}
