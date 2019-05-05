package com.test.polymorphism;

/**
 *  抽象行为类
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
