package com.mmall.design.principle.openclose;

/**
 * Created by 11790 on 2018/12/30.
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, Double price, String name) {
        super(id, price, name);
    }

    //获取原价
    public Double getOriginPrice(){
        return super.getPrice();
    }

    //获取打折价格
    //重写父类的getPrice()方法
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
