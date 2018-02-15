package com.wangbin.thread;

/**
 * 守护线程.
 * Created by wangbin on 2018/02/14.
 */
public class DaemonThread {

    public static void main(String[] args){

        Thread thread = new Thread(){

            @Override
            public void run() {
                while (true){
                    System.out.println("王斌");
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
    }
}
