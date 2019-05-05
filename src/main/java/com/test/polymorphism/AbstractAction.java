package com.test.polymorphism;

/**
 * Created by Administrator on 2019/5/6.
 */
public abstract class AbstractAction {
    public void init(){
        before();
        act();
        after();
    }
    public abstract void  act();
    public void  before(){
        System.out.println("before");
    }

    public void  after(){
        System.out.println("after");
    }
}
