package com.mmall.design.principle.dependenceInversion;

/**
 * Created by 11790 on 2018/12/31.
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Zhou在学习前端课程");
    }
}
