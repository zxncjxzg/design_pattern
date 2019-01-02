package com.mmall.design.principle.openclose;

/**
 * Created by 11790 on 2018/12/30.
 */
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, Double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
