package com.wangbin.thread;

/**
 * 中断线程.
 * Created by wangbin on 2018/02/14.
 */
public class InterruptThreadDemo {

    public static void main(String[] args) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(30000);// 休眠
                    System.out.println("hello everyone!");
                } catch (InterruptedException e) {// 中断异常
                    System.out.println("我醒了.....");
                }
            }
        };

        thread.start();
        thread.interrupt();// 主线程调用thread的interrupt()
    }
}
