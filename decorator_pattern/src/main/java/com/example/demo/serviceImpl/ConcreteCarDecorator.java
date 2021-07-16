package com.example.demo.serviceImpl;

import com.example.demo.service.Car;
import com.example.demo.util.CarDecorator;

/**
 * 具体汽车装饰
 */
public class ConcreteCarDecorator extends CarDecorator {
    public ConcreteCarDecorator(Car car) {
        super(car);
    }
    /**
     * 彩绘
     */
    private void print() {
        System.out.println("在车尾绘制“新手上路”,颜色紫色霞光");
    }
    /**
     * 安装GPS设备
     */
    private void setGps() {
        System.out.println("安装GPS");
    }

    /**
     * 重写show方法
     */
    public void show() {
        super.show();
        this.print();
        this.setGps();
    }
}
