package com.wangbin.thread;

/**
 * 兔子线程.
 * Created by wangbin on 2018/02/14.
 */
public class Hare implements Runnable{

    private boolean[] flags = {true,false};
    private int totalStep;
    private int hareStep;

    public Hare(int totalStep){
        this.totalStep = totalStep;
    }

    @Override
    public void run() {

        while (hareStep<totalStep){

            boolean isHareSleep = flags[(int)((Math.random()*10))%2];
            if(isHareSleep){
                System.out.println("兔子在睡觉ZZZZZZZZZZZZZZZ");
            }else{
                hareStep+=2;
                System.out.printf("兔子跑了%d...%n",hareStep);
            }
        }
    }
}
