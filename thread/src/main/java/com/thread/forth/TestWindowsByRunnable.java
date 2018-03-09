package com.thread.forth;

/**
 * 通过实现Runnable的形式完成多窗口售票的功能
 * <p>
 * Created by WS on 2018/3/9.
 */
class Windows implements Runnable {

    private int tickets = 100;

    @Override
    public void run() {
        try {
            saleTickets();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void saleTickets() throws InterruptedException {
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "正在售票：" + tickets--);
                Thread.sleep(10);
            }
        }
    }
}

public class TestWindowsByRunnable {
    public static void main(String[] args) {
        Windows windows = new Windows();

        Thread t1 = new Thread(windows);
        t1.setName("窗口一：");
        Thread t2 = new Thread(windows);
        t2.setName("窗口二：");
        Thread t3 = new Thread(windows);
        t3.setName("窗口三：");
        t1.start();
        t2.start();
        t3.start();
    }
}
