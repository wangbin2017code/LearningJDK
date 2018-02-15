package com.wangbin.thread;

/**
 * 乌龟和兔子两个线程.
 * Created by wangbin on 2018/02/14.
 */
public class TortoiseHareRace2 {

    public static void main(String[] args) {

        Tortoise tortoise = new Tortoise(10);
        Hare hare = new Hare(10);

        Thread tortoiseThread = new Thread(tortoise);
        Thread hareThread = new Thread(hare);

        // 设置优先级
        tortoiseThread.setPriority(3);
        hareThread.setPriority(8);

        tortoiseThread.start();
        hareThread.start();
    }
}
