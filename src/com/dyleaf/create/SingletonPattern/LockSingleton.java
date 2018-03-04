package com.dyleaf.create.SingletonPattern;

public class LockSingleton{
    private volatile static LockSingleton singleton;
    private LockSingleton(){}

    public static LockSingleton getInstance(){
        if(singleton==null){
            synchronized(LockSingleton.class){
                if(singleton==null){
                    singleton=new LockSingleton(); //非原子性操作
                }
            }
        }
        return singleton;
    }

}