package com.mmall.design.principle.singleResponsibility;

/**
 * Created by 11790 on 2019/1/2.
 */
public class Test {
    public static void main(String[] args) {
        FlyBird flyBird=new FlyBird();
        flyBird.mainMoveMode("大雁");
        WalkBird walkBird=new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
