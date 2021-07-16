package com.example.demo;

import com.example.demo.prototype.AbstractFactory;
import com.example.demo.prototype.ProductA;
import com.example.demo.prototype.ProductB;
import com.example.demo.serviceImpl.ConcreteFactory1;
import com.example.demo.serviceImpl.ConcreteFactory2;
import com.example.demo.serviceImpl.ProductA1;
import com.example.demo.serviceImpl.ProductA2;
import com.example.demo.serviceImpl.ProductB1;
import com.example.demo.serviceImpl.ProductB2;

public class ClientDemo {

    public static void main(String[] args) {
        /**
         * 定义两个工厂
         */
        AbstractFactory factory1 = new ConcreteFactory1();

        AbstractFactory factory2 = new ConcreteFactory2();

        ProductA a1 = new ProductA1();

        ProductA a2 = new ProductA2();

        ProductB b1 = new ProductB1();

        ProductB b2 = new ProductB2();

        a1.method1();
        a2.method1();
        b1.method1();
        b2.method1();
    }
}
