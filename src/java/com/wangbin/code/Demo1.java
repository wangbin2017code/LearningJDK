package com.wangbin.code;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author wangbin
 * @date 2018/5/27 12:05
 */
public class Demo1 {

    public static void main(String[] args){
        Stream<String> stream = Stream.of("I","love","you","too");
        //Optional<String> longest = stream.reduce((str1, str2)->str1.length()>=str2.length()?str1:str2);
        //Optional<String> longest = stream.min((str1,str2)->str1.length()-str2.length());
        //System.out.println(longest.get());
        //Integer lengthSum = stream.reduce(0,(sum,str)->sum+str.length(),(a,b)->a+b);
        int lengthSum1 = stream.mapToInt(str->str.length()).sum();
        System.out.println(lengthSum1);
    }
}
