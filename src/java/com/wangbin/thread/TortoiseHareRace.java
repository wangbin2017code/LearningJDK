package com.wangbin.thread;

/**
 * 龟兔赛跑单线程.
 * Created by wangbin on 2018/02/14.
 */
public class TortoiseHareRace {

    public static void main(String[] args){

        // 兔子睡觉或走两步的标识
        boolean[] flags = {true,false};

        // 总步长
        int totalStep = 10;

        // 乌龟、兔子每秒走的步长初始化
        int tortoiseStep = 0,hareStep = 0;

        System.out.println("龟兔赛跑开始......");

        while (tortoiseStep<totalStep && hareStep<totalStep){

            // 乌龟走一步
            tortoiseStep++;
            System.out.printf("乌龟跑了%d步...%n",tortoiseStep);
            // 产生随机标识兔子此刻是睡觉或走的随机数
            boolean isHareSleep = flags[(int)((Math.random()*10))%2];

            if(isHareSleep){
                System.out.println("兔子睡着了ZZZZZZZZZZZZZz");
            }else{
                hareStep+=2;
                System.out.printf("兔子跑了%d步...%n",hareStep);
            }
        }
    }
}
