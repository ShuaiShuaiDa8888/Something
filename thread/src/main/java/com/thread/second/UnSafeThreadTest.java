package com.thread.second;

/**
 * Created by WS on 2018/2/4.
 */
public class UnSafeThreadTest {
    public static void main(String[] args) {
        Aservise aService = new Aservise();
        UnSafeThread unSafeThreadZhang = new UnSafeThread(aService, "张三");
        UnSafeThread unSafeThreadLi = new UnSafeThread(aService, "李四");
        Thread zhang = new Thread(unSafeThreadZhang);
        Thread li = new Thread(unSafeThreadLi);
        for (int i = 0; i < 50; i++) {
            zhang.start();
            li.start();
        }
    }
}
