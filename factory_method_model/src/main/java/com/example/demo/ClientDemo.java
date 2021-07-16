package com.example.demo;

import com.example.demo.prototype.Fruit;
import com.example.demo.prototype.FruitGardener;
import com.example.demo.serviceImpl.AppleGardener;
import com.example.demo.serviceImpl.GrapeGardener;

public class ClientDemo {

    public static void main(String[] args) {
        /**
         * 苹果园丁工厂
         */
        FruitGardener fruitGardener = new AppleGardener();
        /**
         * 通过工厂生产苹果
         */
        Fruit apple = fruitGardener.factory();
        apple.plant();
        apple.grow();
        apple.harvest();

        System.out.println("------------");
        /**
         * 葡萄园丁工厂
         */
        fruitGardener = new GrapeGardener();
        /**
         * 通过工厂生产苹果
         */
        Fruit grape = fruitGardener.factory();
        grape.plant();
        grape.grow();
        grape.harvest();
    }
}
