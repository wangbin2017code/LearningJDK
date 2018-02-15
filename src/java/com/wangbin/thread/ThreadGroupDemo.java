package com.wangbin.thread;

/**
 * 线程群组.
 * Created by wangbin on 2018/02/15.
 */
public class ThreadGroupDemo {

    public static void main(String[] args) throws InterruptedException {

        ThreadGroup threadGroup = new ThreadGroup("group");
        ThreadGroup threadGroup1 = new ThreadGroup("group1");

        Thread thread1 = new Thread(threadGroup1,"group's number");
        Thread thread2 = new Thread(threadGroup,"group's number thread2");

        Thread[] threads = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);



        Thread thread = new Thread(threadGroup,()->{
            System.out.println(thread2.getThreadGroup().getName()+"----> "+threadGroup.activeCount());

            for(Thread temp:threads){
                System.out.println(temp.getId()+":"+temp.getName());
            }
            int x=20;
            int y=0;
            while (y<x){
                y++;
                System.out.println("----> "+y);
            }
        });

        thread.start();
        thread1.start();
        thread2.start();

        thread.join();
        thread1.join();
        thread2.join();
    }
}
