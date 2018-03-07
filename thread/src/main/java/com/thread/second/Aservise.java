package com.thread.second;

/**
 * Created by WS on 2018/2/4.
 */
public class Aservise {
    private String name;

    public synchronized void doBusiness(String name) {
        this.name = name;
        System.out.println("大家好，我是" + this.name);
    }
}