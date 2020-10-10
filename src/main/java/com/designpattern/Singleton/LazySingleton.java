package com.designpattern.Singleton;

public class LazySingleton {

    private LazySingleton() {}

    private static volatile LazySingleton instance = null;

    public static synchronized LazySingleton getInstance() {
        if (instance == null) instance = new LazySingleton();

        return instance;
    }

}
