package com.github.jengo.dp.hf.singleton.dcl;

public class SingletonClient {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }

}
