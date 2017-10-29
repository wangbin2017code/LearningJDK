package com.wangbin.code;

import java.util.Arrays;
import java.util.List;

/**
 * 学习jdk1.8.
 * Created by wangbin on 2017/10/29.
 */
public class LearningJdkCode {

    public static void main(String[] args) {
        //1. lambda的forEach
        forEachFunc();
    }

    //1.测试lambda的forEach
    private static void forEachFunc() {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);
        for (String player : players) {
            System.out.print(player + "; ");
        }
        System.out.println();
        System.out.println("********************************************");
        //lambda
        players.forEach((player) -> System.out.print(player + ";"));
        players.forEach(System.out::println);
    }
}
