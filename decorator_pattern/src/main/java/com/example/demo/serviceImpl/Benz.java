package com.example.demo.serviceImpl;

import com.example.demo.service.Car;

public class Benz implements Car {
    @Override
    public void show() {
        System.out.println("奔驰黑色");
    }
}
