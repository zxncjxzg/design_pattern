package com.mmall.design.principle.dependenceInversion;

/**
 * Created by 11790 on 2018/12/31.
 */
public class Test {
    public static void main(String[] args) {
        Zhou zhou=new Zhou();
        zhou.setiCourse(new JavaCourse());
        zhou.studyImoocCourse();

        zhou.setiCourse(new FECourse());
        zhou.studyImoocCourse();
    }
}
