package com.itheima.a02interfacetest2;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("蓝球教练在教如何打篮球");
    }
}
