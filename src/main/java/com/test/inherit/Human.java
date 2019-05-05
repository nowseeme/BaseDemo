package com.test.inherit;

/**
 * Created by Administrator on 2019/5/5.
 */
public class Human {
    protected String name;
    protected int age;
    protected String sex;

    Human(String name){
        System.out.println("Human Constructor-----" + name);
    }
}