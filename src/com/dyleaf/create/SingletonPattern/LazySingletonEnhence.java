package com.dyleaf.create.SingletonPattern;

public class LazySingletonEnhence {

    private static LazySingletonEnhence singleton;

    private LazySingletonEnhence(){}

    //    改进版 getInstance方法上加同步
    public static synchronized LazySingletonEnhence getInstance() {
        if (singleton == null) {
            singleton = new LazySingletonEnhence();
        }
        return singleton;
    }
}
