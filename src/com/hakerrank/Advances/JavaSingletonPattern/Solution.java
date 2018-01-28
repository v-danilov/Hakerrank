package com.hakerrank.Advances.JavaSingletonPattern;


class Singleton {

    private static Singleton instance = null;
    public String str;

    private Singleton() {

    }

    static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
