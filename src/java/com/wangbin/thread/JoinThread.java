package com.wangbin.thread;

import static java.lang.System.out;

/**
 * Created by wangbin on 2018/02/14.
 */
public class JoinThread {

    public static void main(String[] args) throws InterruptedException {
        out.println("Main Thread 开始...");

        Thread threadB = new Thread(()->{
           out.println("Thread B 开始...");
            for(int i=0;i<5;i++){
                out.println("Thread B 执行---》"+(i+1));
            }
            out.println("Thread B 将结束...");
        });

        threadB.start();
        threadB.join();// ThreadB加入Main Thread流程

        out.println("Main Thread 将结束...");
    }
}
