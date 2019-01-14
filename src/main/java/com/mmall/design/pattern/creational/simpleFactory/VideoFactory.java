package com.mmall.design.pattern.creational.simpleFactory;

/**
 * Created by 11790 on 2019/1/13.
 */
public class VideoFactory {
    public Video getVideo(Class c){
        Video video=null;
        try {
            video=(Video)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
