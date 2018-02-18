package com.wangbin.thread;

import java.util.ArrayList;

/**
 * 线程同步.
 * Created by wangbin on 2018/02/18.
 */
public class SynchronizedThreadDemo {

    private String name;
    private int resource;

    SynchronizedThreadDemo(String name ,int resource){
        this.name = name;
        this.resource = resource;
    }

    public String getName() {
        return name;
    }

    synchronized int doSome(){
        return ++resource;
    }

    synchronized void cooperate(SynchronizedThreadDemo synchronizedThreadDemo){
        synchronizedThreadDemo.doSome();
        System.out.printf("%s 整合 %s 的资源%n",this.name,synchronizedThreadDemo.getName());
    }

}
