package com.dyleaf.create.SingletonPattern;


import java.util.HashMap;
import java.util.Map;

/**
 * 可以忽略
 */
public class SingletonManager {
    private SingletonManager() {
    }

    private static Map<String, Object> objectMap = new HashMap<>();

    public static void registerService(String key,Object instance){
        if (!objectMap.containsKey(key)){
            objectMap.put(key,instance);
        }
    }

    public static Object getService(String key){
        return objectMap.get(key);
    }

}