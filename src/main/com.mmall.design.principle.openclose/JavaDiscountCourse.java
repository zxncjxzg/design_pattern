/**
 * Created by 11790 on 2018/11/28.
 */

/**
 * 打了折的Java课程类，继承了Java课程类
 */
public class JavaDiscountCourse extends JavaCourse {
    /**
     * 继承了父类的构造器
     * @param id
     * @param name
     * @param price
     */
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 获取课程原始价格
     * @return
     */
    public Double getOriginPrice(){
        return super.getPrice();
    }

    /**
     * 重写了父类的getPrice()方法，得到打了折扣的价格
     * @return
     */
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
