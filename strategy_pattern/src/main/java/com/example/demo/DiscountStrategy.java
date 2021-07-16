package com.example.demo;

/**
 * 抽象折扣算法类
 */
public abstract class DiscountStrategy {
    /**
     * 书的价格
     */
    private double price = 0;
    /**
     * 书的数量
     */
    private int number = 0;
    /**
     * 构造函数
     */
    public DiscountStrategy(double price, int number) {
        this.price = price;
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }
    /**
     * 策略方法，计算折扣额
     */
    public abstract double calculateDiscount();
}
