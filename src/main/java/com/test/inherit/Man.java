package com.test.inherit;

/**
 * Created by Administrator on 2019/5/5.
 */
public class Man extends Human{
    private Wife wife;

    Man(){
        super("helloworld");
        System.out.println("Husband Constructor...");
    }

    public static void main(String[] args) {
        Man husband  = new Man();
    }
}