package com.example.demo.util;

import com.example.demo.service.Car;

/**
 * 汽车修饰抽象类
 */
public class CarDecorator implements Car {
    private Car car = null;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void show() {
        this.car.show();
    }
}
