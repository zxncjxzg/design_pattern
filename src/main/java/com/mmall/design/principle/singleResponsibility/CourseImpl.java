package com.mmall.design.principle.singleResponsibility;

/**
 * Created by 11790 on 2019/1/2.
 */
public class CourseImpl implements ICourseContent,ICourseManager {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
