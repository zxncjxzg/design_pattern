package com.mmall.design.principle.singleResponsibility;

/**
 * Created by 11790 on 2019/1/2.
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
