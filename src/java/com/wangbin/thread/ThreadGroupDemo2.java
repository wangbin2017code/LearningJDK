package com.wangbin.thread;

/**
 * Created by wangbin on 2018/02/15.
 */
public class ThreadGroupDemo2 {

    public static void main(String[] args){
        ThreadGroup group = new ThreadGroup("group");

        Thread thread1 = new Thread(group,()->{
            throw new RuntimeException("thread1测试例外");
        });

        thread1.setUncaughtExceptionHandler((thread,throwable)->{
            System.out.printf("%s: %s%n",thread.getName(),throwable.getMessage());
        });

        Thread thread2 = new Thread(group,()->{
           throw new RuntimeException("thread2 测试异常");
        });

        thread1.start();
        thread2.start();
    }
}
