package com.wangbin.thread;

/**
 * Created by wangbin on 2018/02/18.
 */
public class TestDeadLockDemo {

    public static void main(String[] args) {

        SynchronizedThreadDemo synchronizedThreadDemo1 = new SynchronizedThreadDemo("resource1", 10);
        SynchronizedThreadDemo synchronizedThreadDemo2 = new SynchronizedThreadDemo("resource2", 20);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronizedThreadDemo1.cooperate(synchronizedThreadDemo2);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronizedThreadDemo2.cooperate(synchronizedThreadDemo1);
            }
        });

        thread1.start();
        thread2.start();
    }
}
