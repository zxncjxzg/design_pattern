package com.mmall.design.principle.dependenceInversion;

/**
 * Created by 11790 on 2018/12/31.
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Zhou在学习Java课程");
    }
}
