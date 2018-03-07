package com.thread.second;

/**
 * Created by WS on 2018/2/4.
 */
public class UnSafeThread implements Runnable {
    private Aservise aServise;
    private String name;

    public UnSafeThread(Aservise aServise, String name) {
        this.aServise = aServise;
        this.name = name;
    }

    @Override
    public void run() {
        aServise.doBusiness(name);
    }
}
