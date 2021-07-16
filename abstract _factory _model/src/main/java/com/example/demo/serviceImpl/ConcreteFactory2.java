package com.example.demo.serviceImpl;

import com.example.demo.prototype.AbstractFactory;
import com.example.demo.prototype.ProductA;
import com.example.demo.prototype.ProductB;

public class ConcreteFactory2 implements AbstractFactory {

    /**
     * 创建等级为2的产品A
     * @return
     */
    @Override
    public ProductA factoryA() {
        return new ProductA2();
    }

    /**
     * 创建等级为1的产品B
     * @return
     */
    @Override
    public ProductB factoryB() {
        return new ProductB2();
    }
}
