package com.wangbin.thread;

/**
 * 乌龟线程.
 * Created by wangbin on 2018/02/14.
 */
public class Tortoise implements Runnable {

    private int totalStep;
    private int tortoiseStep;

    public Tortoise(int totalStep) {
        this.totalStep = totalStep;
    }

    @Override
    public void run() {
        while (tortoiseStep < totalStep) {
            tortoiseStep++;
            System.out.printf("乌龟跑了%d....%n", tortoiseStep);
        }
    }
}
