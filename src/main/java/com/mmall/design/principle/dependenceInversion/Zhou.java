package com.mmall.design.principle.dependenceInversion;

/**
 * Created by 11790 on 2018/12/31.
 */
public class Zhou{
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }
}
