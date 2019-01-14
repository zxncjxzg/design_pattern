package com.mmall.design.pattern.creational.simpleFactory;

/**
 * Created by 11790 on 2019/1/13.
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory=new VideoFactory();
        Video video=videoFactory.getVideo(JavaVideo.class);
        if(video==null){
            return;
        }
        video.produce();
    }
}
