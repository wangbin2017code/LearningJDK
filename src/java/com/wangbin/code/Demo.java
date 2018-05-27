package com.wangbin.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangbin
 * @date 2018/5/26 23:10
 */
public class Demo {

    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(new Student(1, "zhangsan"), new Student(2, "lisi"),
                new Student(3, "hhhh"), new Student(4, "uuu"));
        List<Student> temp = studentList.stream().map(s -> {
            s.setAge(add(s.getAge()));
            return s;
        }).collect(Collectors.toList());
        temp.stream().forEach(t -> System.out.println(t.getAge()));
    }

    public static int add(int a) {
        return a + 3;
    }
}
