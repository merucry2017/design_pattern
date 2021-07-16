package com.example.demo.prototype;

public interface AbstractFactory {
    /**
     * 工厂A
     */
    ProductA factoryA();
    /**
     * 工厂B
     */
    ProductB factoryB();
}
