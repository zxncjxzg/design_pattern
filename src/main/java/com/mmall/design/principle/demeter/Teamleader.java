package com.mmall.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 11790 on 2019/1/12.
 */
public class TeamLeader {
    public void checkNumber(){
        List<Course> courseList=new ArrayList<Course>();
        for(int i=0;i<20;i++){
            courseList.add(new Course());
        }
        System.out.println("课程数量为"+courseList.size());
    }
}
