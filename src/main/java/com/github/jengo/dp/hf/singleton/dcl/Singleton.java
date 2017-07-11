package com.github.jengo.dp.hf.singleton.dcl;

/**
 * Danger!  This implementation of Singleton not guaranteed to work prior to Java 5
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (null == uniqueInstance) {
            synchronized (Singleton.class) {
                if (null == uniqueInstance) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a dcl Singleton!";
    }

}
