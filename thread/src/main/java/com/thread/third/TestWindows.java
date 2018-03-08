package com.thread.third;

/**
 * 继承Thread的方式创建线程，实现卖票
 * <p>
 * Created by WS on 2018/3/8.
 */
class Windows extends Thread {

    static int tickets = 100;

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "售票：" + tickets--);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (tickets < 1) {
                break;
            }
        }
    }

    public Windows(String name) {
        super(name);
    }
}

public class TestWindows {
    public static void main(String[] args) {
        Windows w01 = new Windows("窗口一");
        Windows w02 = new Windows("窗口二");
        Windows w03 = new Windows("窗口三");

        w01.start();
        w02.start();
        w03.start();
    }
}
