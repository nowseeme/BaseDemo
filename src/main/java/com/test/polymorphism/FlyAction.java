package com.test.polymorphism;

/**
 * 飞的行为
 */
public class FlyAction extends AbstractAction {
    @Override
    public void act() {
        System.out.println("fly action");
    }

    @Override
    public void init(){
          super.init();
    }

}
