package com.example.demo;

import com.example.demo.service.Car;
import com.example.demo.serviceImpl.Benz;
import com.example.demo.serviceImpl.ConcreteCarDecorator;
import com.example.demo.util.CarDecorator;

public class ClientDemo {

    public static void main(String[] args) {
        Car car = new Benz();
        car.show();
        System.out.println("--------");
        /**
         * 装饰
         */
        car = new ConcreteCarDecorator(car);
        car.show();
    }
}
