package com.example.demo.serviceImpl;

import com.example.demo.bean.Apple;
import com.example.demo.prototype.Fruit;
import com.example.demo.prototype.FruitGardener;

/**
 * 苹果园丁可以实现FruitGardener接口，
 * 是一个用于生产苹果的具体工厂
 */
public class AppleGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Apple();
    }
}
