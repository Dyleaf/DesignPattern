package com.dyleaf.create.SingletonPattern;

/**
 * 懒汉式
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }




}