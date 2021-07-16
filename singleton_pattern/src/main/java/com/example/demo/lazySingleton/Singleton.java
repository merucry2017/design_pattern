package com.example.demo.lazySingleton;

public class Singleton {

    private static Singleton _instance = null;

    /**
     * 构造方法私有，保证外界无法直接实例化
     */
    private Singleton() {

    }

    /**
     * 双重锁校验，避免线程A和线程B同时调用此方法
     * if (_instance == null)都为true时，
     * 内存中会创建两个Singleton对象
     */
    public static Singleton getInstance() {
        if (_instance == null) {
            synchronized (Singleton.class) {
                if (_instance == null) {
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
    }
}
