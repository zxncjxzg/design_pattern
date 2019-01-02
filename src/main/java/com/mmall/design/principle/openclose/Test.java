package com.mmall.design.principle.openclose;

/**
 * Created by 11790 on 2018/11/28.
 */
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse=new JavaCourse(1,348d,"java从零到企业级电商开发");
        System.out.println("课程ID："+javaCourse.getId()+",课程名称："+javaCourse.getName()+",课程价格："+javaCourse.getPrice()+"元。");
    }
}
