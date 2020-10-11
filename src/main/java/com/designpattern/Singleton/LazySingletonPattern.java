package com.designpattern.Singleton;

public class LazySingletonPattern {

    private LazySingletonPattern() {}

    private static volatile LazySingletonPattern instance = null;

    public static synchronized LazySingletonPattern getInstance() {
        if (instance == null) instance = new LazySingletonPattern();

        return instance;
    }

}
