package com.dyleaf.create.SingletonPattern;

/**
 * 饿汉模式
 */
public class StaffSingleton {

    private static final StaffSingleton single = new StaffSingleton();

    private StaffSingleton() {
    }

    public static StaffSingleton getSingle() {
        return single;
    }
}
